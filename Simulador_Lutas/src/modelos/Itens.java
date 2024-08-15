package modelos;

import java.util.ArrayList;
import java.util.List;

public class Itens {
	 private List<Item> itens;

	 public Itens() {
		 itens = new ArrayList<>();
	 }

	 public void addItem(Item item) {
		 itens.add(item);
	 }
	 public Item getItemByName(String nome) {
		 for (Item item : itens) {
			 if (item.getNome().equals(nome)) {
				 return item;
	         }
		 }
	     return null; // Retorna null se o item não for encontrado
	 }
}
