package ar.edu.unlam.pb2;

public class Disco {
	
		//atributos
	
		private Double radioInterior; 
		private Double radioExterior;

		//constructor
		
		public Disco(Double radioInterior, Double radioExterior){ //Constructor con parametros
			 this.radioInterior = radioInterior;
			 this.radioExterior = radioExterior;
		}
		
		//metodos
		
		public Double calcularPerimetroInterior(){		
			Double perimetroInterior; //creo una variable local
			perimetroInterior = 2*Math.PI*radioInterior;
			return perimetroInterior; 
		}
		
		public Double calcularPerimetroExterior(){		
			Double perimetroExterior;
			perimetroExterior = 2*Math.PI*radioExterior;
			return perimetroExterior;
		}
		
		public Double calcularSuperficie(){
			Double superficie;
			superficie = Math.PI*Math.pow(radioExterior, 2.0);
			return superficie;
		}

		//getters y setters

		public Double getRadioInterior() {
			return radioInterior;
		}

		public void setRadioInterior(Double radioInterior) {
			this.radioInterior = radioInterior;
		}

		public Double getRadioExterior() {
			return radioExterior;
		}

		public void setRadioExterior(Double radioExterior) {
			this.radioExterior = radioExterior;
		}
}
