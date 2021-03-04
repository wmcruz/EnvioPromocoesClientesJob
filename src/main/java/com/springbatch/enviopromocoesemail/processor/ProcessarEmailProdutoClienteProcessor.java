package com.springbatch.enviopromocoesemail.processor;

import java.text.NumberFormat;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

import com.springbatch.enviopromocoesemail.dominio.InteresseProdutoCliente;

@Component
public class ProcessarEmailProdutoClienteProcessor implements ItemProcessor<InteresseProdutoCliente, SimpleMailMessage> {

	@Override
	public SimpleMailMessage process(InteresseProdutoCliente interesseProdutoCliente) throws Exception {
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setFrom("xpto@no-reply.com");
		simpleMailMessage.setTo(interesseProdutoCliente.getCliente().getEmail());
		simpleMailMessage.setSubject("Promoção Imperdível!!!");
		simpleMailMessage.setText(gerarTextoPromocao(interesseProdutoCliente));
		Thread.sleep(2000);
		return null;
	}

	private String gerarTextoPromocao(InteresseProdutoCliente interesseProdutoCliente) {
		StringBuilder writer = new StringBuilder();
		writer.append(String.format("Olá,  %s!\n\n", interesseProdutoCliente.getCliente().getNome()));
		writer.append("Essa promoção pode ser do seu interesse:\n\n");
		writer.append(String.format("%s - %s\n\n", interesseProdutoCliente.getProduto().getNome(), interesseProdutoCliente.getProduto().getDescricao()));
		writer.append(String.format("Por apenas: %s!", NumberFormat.getCurrencyInstance().format(interesseProdutoCliente.getProduto().getPreco())));
		
		return writer.toString();
	}
	
}