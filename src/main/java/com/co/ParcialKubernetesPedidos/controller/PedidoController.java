package com.co.ParcialKubernetesPedidos.controller;

import com.co.ParcialKubernetesPedidos.service.PedidoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pedido")

public class PedidoControl

    private final PedidoService pedidoService;
    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping("/generar-pedido")
    public String generarPedido() {
        return pedidoService.getMensaje();
    }
}
