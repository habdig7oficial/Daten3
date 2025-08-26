class Uhr{
    private 
        int secunden,
            minuten,
            stunden;

    public Uhr(){
        this.secunden = 0;
        this.minuten = 0;
        this.stunden = 0;
        
        this.nachst();
    }

    public Uhr(int stunden, int minuten, int secunden){
        this.secunden = secunden;
        this.minuten = minuten;
        this.stunden = stunden;

        this.nachst();
    }

    public void bestatigen(int faktor, int min, int max){
        System.out.printf("V: %d\n", faktor);
        if (faktor < min || faktor > max){
            throw new IllegalArgumentException("Zu Groß/klein");
        }
    }

    public void setzenSecunden(int secunden){ 
        bestatigen(secunden, 0, 60);
        this.secunden = secunden; 
    }
    public void setzenMinuten(int minuten){ 
        bestatigen(minuten, 0, 60);
        this.minuten = minuten;   
    }
    public void setzenStunden(int stunden){ 
        bestatigen(stunden, 0, 24);
        this.stunden = stunden;   
    }

    public void nachst(){
        while(true){
            this.secunden++;
            System.out.printf("%s\n", this.nehmenSpat());
            if(this.secunden > 59 ){
                this.secunden = 0;
                this.minuten++;
            }
            else if(this.minuten > 59){
                this.secunden = 0;
                this.stunden++;
            }


            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){

            }
        }
    }

    public int nehmenSecunden() {  return this.secunden; }
    public int nehmenMinuten()  {  return this.minuten;  }
    public int nehmenStunden()  {  return this.stunden;  }

    public String nehmenSpat(){
        return String.format("%02d:%02d:%02d", this.stunden, this.minuten, this.secunden);
    }

}
