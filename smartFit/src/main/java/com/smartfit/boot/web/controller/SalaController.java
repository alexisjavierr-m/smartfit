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

import com.smartfit.boot.domain.Departamento;
import com.smartfit.boot.domain.Estado;
import com.smartfit.boot.domain.Sala;
import com.smartfit.boot.service.DepartamentoService;
import com.smartfit.boot.service.EstadoService;
import com.smartfit.boot.service.SalaService;

@Controller
@RequestMapping("/salas")
public class SalaController {
	
	@Autowired
	private SalaService service;
	
	@Autowired
	private DepartamentoService departamentoService;
	
	@Autowired
	private EstadoService estadoService;

	@GetMapping("/cadastrar")
	public String cadastrar(Sala sala) {
		return "/sala/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("salas", service.buscarTodos());
		return "/sala/lista"; 
	}
	
	@PostMapping("/salvar")
	public String salvar(Sala sala, RedirectAttributes attr) {
		service.salvar(sala);
		attr.addFlashAttribute("success", "Sala creada exitosamente");
		return "redirect:/salas/cadastrar";
	}
	
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("sala", service.buscarPorId(id));
		return "/sala/cadastro";
	}
	
	@PostMapping("/editar")
	public String editar(Sala sala, RedirectAttributes attr) {
		service.editar(sala);
		attr.addFlashAttribute("success", "Sala editada correctamente");
		return "redirect:/salas/cadastrar";
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
		model.addAttribute("success", "Sala eliminada correctamente");
		return listar(model);
	}
	
	@ModelAttribute("departamentos")
	public List<Departamento> listaDeDepartamentos() {
		return departamentoService.buscarTodos();
	}
	
	@ModelAttribute("estados")
	public List<Estado> listaDeEstados() {
		return estadoService.buscarTodos();
	}
}
