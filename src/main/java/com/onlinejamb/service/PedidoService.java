package com.onlinejamb.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.onlinejamb.model.Estado;
import com.onlinejamb.model.Pedido;
import com.onlinejamb.model.Usuario;
import com.onlinejamb.repository.PedidoRepository;

@Service
public class PedidoService {
	@Autowired
	PedidoRepository pr;
	
	public void crearPedido(Pedido pedido) {
		pr.save(pedido);
	}
	
	public ArrayList<Pedido> obtenerPedidosUsuario(Usuario usuario){
		ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
		pedidos = pr.findByUsuario(usuario);
		return pedidos;
	}
	
	public Pedido obtenerPedidoUsuario(int id) {
		Pedido pedido = pr.getById(id);
		return pedido;
	}
	
	public void cambiarEstado(Estado nuevoEstado, int id) {
		pr.cancelarPedido(nuevoEstado, id);
	}
	
	public ArrayList<Pedido> getPedidos(){
		ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
		pedidos = (ArrayList<Pedido>)pr.findAll();
		return pedidos;
	}
}
