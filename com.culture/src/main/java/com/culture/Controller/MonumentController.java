package com.culture.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import com.culture.Entity.Lieu;
import com.culture.Entity.Monument;
import com.culture.Repository.LieuRepository;

@Controller
public class MonumentController {
	@Autowired
	private MonumentRepository monumentRepository;

	@GetMapping("/")
	public String home() {
		return "index";

	}
	@GetMapping("/user/index")
	public String monuments (Model model,
							@RequestParam(name="page", defaultValue="0") int page,
							@RequestParam(name="size", defaultValue="7") int size,
							@RequestParam(name="keyword", defaultValue="") String keyword

								){
		Page<Monument> pageMonuments=monumentRepository.findByNomMContains(keyword,PageRequest.of(page, size));
		model.addAttribute("listMonument", pageMonuments.getContent());
		model.addAttribute("pages", new int[pageMonuments.getTotalPages()]);
		model.addAttribute("currentPage",page);
		model.addAttribute("keyword",keyword);
		return "monuments";
	}

	
	@GetMapping("/admin/delete")
	public String delete(String id, String keyword, int page) {
		monumentRepository.deleteById(id);
		return "redirect:/user/index?page="+page+"&keyword="+keyword;
		
	}

	
	@GetMapping("/admin/formMonument")
	public String formMonument(Model model) {

		model.addAttribute("monument",new Monument());
		return "formMonument";
		
	}
	
	@PostMapping("/admin/save")
	public String save(Model model, @Valid Monument monument, BindingResult bindingResult, 
			RedirectAttributes ra,  
			@RequestParam(defaultValue="") String keyword, 
			@RequestParam(defaultValue="0") int page) {
		
		if(bindingResult.hasErrors()) return "formMonument";
		ra.addFlashAttribute("message", "Monument ajout?? avec succes!");
		monumentRepository.save(monument);
		return "redirect:/user/index?page="+page+"&keyword="+keyword;
		
	}
	@PostMapping("/login?logout")
	public String deconnected() {
		return "redirect:/";
		
	}
	
	@GetMapping("/admin/edit")
	public String edit(Model model, String id, String keyword, int page) {
		Monument monument=monumentRepository.findById(id).orElse(null);
		if(monument==null) throw new RuntimeException("Monument Introuvable");

		model.addAttribute("monument",monument);
		model.addAttribute("page",page);
		model.addAttribute("keyword", keyword);
		return "editMonument";
		
	}
	
	
	
	
	
	
	
	
	

}
