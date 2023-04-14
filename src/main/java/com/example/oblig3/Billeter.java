package com.example.oblig3;

public class Billeter {
        private String valg;
        private int antall;
        private  String fornavn;
        private  String etternavn;
        private String telfoonr;
        private  String epost;

    public Billeter() {
    }

    public Billeter(String valg, int antall, String fornavn, String etternavn, String telfoonr, String epost) {
            this.valg = valg;
            this.antall = antall;
            this.fornavn = fornavn;
            this.etternavn = etternavn;
            this.telfoonr=telfoonr;
            this.epost = epost;
        }

        public String getValg() {
            return valg;
        }

        public void setValg(String valg) {
            this.valg = valg;
        }

        public int getAntall() {
            return antall;
        }

        public void setAntall(int antall) {
            this.antall = antall;
        }

        public String getFornavn() {
            return fornavn;
        }

        public void setFornavn(String fornavn) {
            this.fornavn = fornavn;
        }

        public String getEtternavn() {
            return etternavn;
        }

        public void setEtternavn(String etternavn) {
            this.etternavn = etternavn;
        }

        public String getTelfoonr() {
            return telfoonr;
        }

        public void setTelfoonr(String telfoonr) {
            this.telfoonr = telfoonr;
        }

        public String getEpost() {
            return epost;
        }

        public void setEpost(String epost) {
            this.epost = epost;
        }
    }










