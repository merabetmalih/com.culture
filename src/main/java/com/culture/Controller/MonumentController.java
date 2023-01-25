package com.culture.Controller;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import com.culture.Repository.MonumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.culture.Entity.Monument;

import java.util.List;

@Controller

public class MonumentController {

	private final  MonumentRepository monumentRepository;
	@Autowired

	public MonumentController(MonumentRepository monumentRepository) {
		this.monumentRepository = monumentRepository;
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
	@GetMapping("/")
	public String home() {


		return "index";
		
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
		ra.addFlashAttribute("message", "Monument ajouté avec succes!");
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
