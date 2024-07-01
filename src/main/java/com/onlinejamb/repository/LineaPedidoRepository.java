package com.onlinejamb.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinejamb.model.LineaPedido;
import com.onlinejamb.model.Pedido;

public interface LineaPedidoRepository extends JpaRepository<LineaPedido, Integer>{
	ArrayList<LineaPedido> findByPedido(Pedido pedido);
}
