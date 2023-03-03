package GerenciadorArquivos;

import java.io.*;

public class Gerenciador{
	public String nomeExtensao;
	
	public Gerenciador(String fileNameAndExtension) {
		this.nomeExtensao = fileNameAndExtension;
	}

	
	
	public String getNomeExtensao() {return this.nomeExtensao;}
    public void setNomeExtensao(String nomeExtensao) {this.nomeExtensao = nomeExtensao;}
    
	
	public boolean verificaSeExiste() {

		String url = "Arquivos/"+nomeExtensao;
		
		File file = new File(url);
		
		if(file.exists()) {
			return true;
		}
			
		else {
			return false;
		}
			
	}
	
	public boolean criarArquivo(){
		
		String url = "Arquivos/"+nomeExtensao;
		File file = new File(url);
		
		try {
            if (file.createNewFile()) {
            	return true;
            } 
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo.");
            e.printStackTrace();
        }
		
		return false;
		
		
			
	}
	
	public String lerArquivo() {
		String texto = "";
		
		try {
			
			String url = "Arquivos/"+nomeExtensao;
			File file = new File(url);
			
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
   
			while (br.ready()) {
       
            String linha = br.readLine();
            texto += "\n";
            texto += linha;
			}
   
			br.close();
			fr.close();
			
			
   
		 } catch (IOException ex) {
	            ex.printStackTrace();
	        }

		return texto;
	}
	
	public void escrever(String txt, boolean selecaoEscrever, boolean novaLinha) {
		
		try {
			String url = "Arquivos/"+nomeExtensao;
			File file = new File(url);
			FileWriter fw = new FileWriter(file, selecaoEscrever);
	       
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			if(novaLinha) {
				bw.newLine();
			}
			
			bw.write(txt);

			
			
   
			bw.close();
			fw.close();
        
		 } catch (IOException ex) {
	            ex.printStackTrace();
	        }

	}
	
	public boolean apagar() {
		String url = "Arquivos/"+nomeExtensao;
		File file = new File(url);
        
        return file.delete();
	}
	
	
}
