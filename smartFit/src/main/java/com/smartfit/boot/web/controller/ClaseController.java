package com.smartfit.boot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.smartfit.boot.domain.Clase;
import com.smartfit.boot.domain.Funcionario;
import com.smartfit.boot.domain.Sala;
import com.smartfit.boot.service.ClaseService;
import com.smartfit.boot.service.FuncionarioService;
import com.smartfit.boot.service.SalaService;

@Controller
@RequestMapping("/clases")
public class ClaseController {		
	
		@Autowired
		private ClaseService service;
		
		@Autowired
		private SalaService salaService;
		
		@Autowired
		private FuncionarioService funcionarioService;

		@GetMapping("/cadastrar")
		public String cadastrar(Clase clase) {
			return "/clase/cadastro";
		}
		
		@GetMapping("/listar")
		public String listar(ModelMap model) {
			model.addAttribute("clases", service.buscarTodos());
			return "/clase/lista"; 
		}
		
		@PostMapping("/salvar")
		public String salvar(Clase clase, RedirectAttributes attr) {
			service.salvar(clase);
			attr.addFlashAttribute("success", "clase creada exitosamente");
			return "redirect:/clases/cadastrar";
		}
		
		@GetMapping("/editar/{id}")
		public String preEditar(@PathVariable("id") Long id, ModelMap model) {
			model.addAttribute("clase", service.buscarPorId(id));
			return "/clase/cadastro";
		}
		
		@PostMapping("/editar")
		public String editar(Clase clase, RedirectAttributes attr) {
			service.editar(clase);
			attr.addFlashAttribute("success", "clase editada correctamente");
			return "redirect:/clases/cadastrar";
		}
		
		@GetMapping("/excluir/{id}")
		public String excluir(@PathVariable("id") Long id, ModelMap model) {
			
			/**
			if (service.departamentoTemCargos(id)) {
				model.addAttribute("fail", "Sede no eliminada. Porque hay un cargo asociado");
			} else {
				service.excluir(id);
				model.addAttribute("success", "Sede eliminada correctamente");
			}
			*/
			
			service.excluir(id);
			model.addAttribute("success", "Clase eliminada correctamente");
			return listar(model);
		}
		
		@ModelAttribute("salas")
		public List<Sala> listaDeSalas() {
			return salaService.buscarTodos();
		}
		
		@ModelAttribute("funcionarios")
		public List<Funcionario> listaDeFuncionarios() {
			return funcionarioService.buscarTodos();
		}
	}
