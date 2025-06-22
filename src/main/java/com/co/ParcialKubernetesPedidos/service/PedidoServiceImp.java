package com.co.ParcialKubernetesPedidos.service;

import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImp implements PedidoService {

    @Override
    public String getMensaje(){
        System.out.println("Log generando pedido desde el servicio");
        return "Generando pedido desde el servicio";
    }
}
