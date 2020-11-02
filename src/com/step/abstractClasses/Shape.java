package com.step.abstractClasses;

    //Cerinta:
    //Clacularea perimetrului , ariei pt figuri geometrice
    //Fiecare figura e caracterizata de nume si culoare
    public abstract class Shape {
        private final String name;
        private String color;
//        nu e cel mai bun variant de a folosi blocurile de initializare
//        {
//            name = Shape;
//        }
        public String getName(){ return name; }
        public Shape(String name, String color){
            this.name = name;
            this.color = color;
        }

        //pentru diferite figuri avem nevoie de o logica proprie(Perimetru patrat->doar o latura)
        //de aceea trebuie sa creeam o clasa copil care reprezinta fiecare tip de figura definita

        protected abstract Double getPerimeter();
        protected abstract Double getSurface();
    }
