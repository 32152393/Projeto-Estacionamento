/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estacionamento;

import Models.Usuario;
import java.util.Scanner;
/**
 *
 * @author André
 */
public class Estacionamento {
    
    public static void main(String[] args) {
        int opcao = 0;
        Scanner scan = new Scanner(System.in);
        Usuario usuario = new Usuario();
        System.out.println("Insira seu nome");
        usuario.setNome(scan.nextLine());
        System.out.println("Insira seu login");
        usuario.setLogin(scan.nextLine());
        System.out.println("Insira sua senha");
        usuario.setSenha(scan.nextLine());
        System.out.println("Nome, " + usuario.getNome() + "Login, " + usuario.getLogin() + "Senha, " + usuario.getSenha()); 
        System.out.println("Deseja salvar seus dados?");
        System.out.println("Digite 1 para salvar ou 2 para Cancelar");
        opcao = scan.nextInt();
        
        switch (opcao) {
            case 1:
                usuario.Registrar();
                break;
            default:
                break;
        }
        
    }
    
}
