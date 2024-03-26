package calculation.service;

import calculation.model.Entity;

public class calculationService {

	  public Entity jurosSimples(Entity entity, double principal, float taxa, int meses) {
	        double juros = principal * taxa * meses;
	        double montante = principal + juros;
	        entity.setTotaldeJuros(juros);
	        entity.setMontante(montante);
	        System.out.println("Juros Simples:R$  " + juros);
	        System.out.println("Montante:R$  " + montante);
	        System.out.printf("Total a pagar:R$ %.2f  ", juros + montante);
	        return entity;
	    }

    public Entity jurosComposto(Entity entity, double principal, float taxa, int meses) {
        double montante = principal * Math.pow((1 + taxa), meses);
        double juros = montante - principal;
        entity.setTotaldeJuros(juros);
        entity.setMontante(montante);
        System.out.println("Juros Composto: " + juros);
        System.out.println("Montante: " + montante);
        return entity;
    }
}

