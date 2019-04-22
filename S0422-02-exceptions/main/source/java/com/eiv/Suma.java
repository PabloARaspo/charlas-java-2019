package com.eiv;

public class Suma {
    
    private Integer dato1;
    private Integer dato2;

    public Suma(Integer dato1, Integer dato2) {
        super();
        
        if (dato1 >= dato2) {
            throw new SumaException(SumaException.dato1_mayor_dato2, "Dato1 debe ser menor o igual que dato2.");
        }
        
        this.dato1 = dato1;
        this.dato2 = dato2;
    }

    public Suma() {
        
    }

    public Integer getDato1() {
        return dato1;
    }



    public void setDato1(Integer dato1) {
        this.dato1 = dato1;
    }



    public Integer getDato2() {
        return dato2;
    }



    public void setDato2(Integer dato2) {
        this.dato2 = dato2;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dato1 == null) ? 0 : dato1.hashCode());
        result = prime * result + ((dato2 == null) ? 0 : dato2.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Suma other = (Suma) obj;
        if (dato1 == null) {
            if (other.dato1 != null)
                return false;
        } else if (!dato1.equals(other.dato1))
            return false;
        if (dato2 == null) {
            if (other.dato2 != null)
                return false;
        } else if (!dato2.equals(other.dato2))
            return false;
        return true;
    }

    public Integer resultado()  {
        Integer res = dato1 + dato2;
        if(res > 10) {
            throw new SumaException(SumaException.dato1_mas_dato2_mayor10, "dato1 + dato2 no debe ser mayor que 10.");
        }
        return res;
    }


}
