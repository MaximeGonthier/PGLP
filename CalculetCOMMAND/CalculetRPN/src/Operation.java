public enum Operation implements Interpreteur {
	
    PLUS("+"){
    	public double x;
        public double y;
        
        @Override
        public double eval(double x, double y) {
            this.x = x;
            this.y = y;
            return execute();
        }

		@Override
		public double execute() {
			return this.x + this.y;
		}
    },

	MOINS("-"){
    	public double x;
        public double y;
        
        @Override
        public double eval(double x, double y) {
            this.x = x;
            this.y = y;
            return execute();
            
        }

		@Override
		public double execute() {
			return this.x - this.y;
		}
    },

    MULT("*"){
    	public double x;
        public double y;
        
        @Override
        public double eval(double x, double y) {
            this.x = x;
            this.y = y;
            return execute();
        }

		@Override
		public double execute() {
			return this.x * this.y;
		}
    },

    DIV("/"){
    	public double x;
        public double y;
        
        @Override
        public double eval(double x, double y) {
            this.x = x;
            this.y = y;
            return execute();
        }

		@Override
		public double execute() {
			return this.x / this.y;
		}
    };

    private String symbole;

    private Operation(String psymbole){
        this.setSymbole(psymbole);
    }

    public abstract double eval (double x, double y) throws IllegalArgumentException;

	public String getSymbole() {
		return symbole;
	}

	public void setSymbole(String symbole) {
		this.symbole = symbole;
	}
}
