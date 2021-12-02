package com.example.chapp;

public class UsuarioR {
    int Id, idReporte, idPago,idAdmin;
    String nContrato, nContratoR, codigP, correo, contraseña, cContraseña, direccion, desFalla, nombre, apellidop, apellidom, usuario, paswoord, apellios, nombreP, nContratoP, nTargeta, fExpedicion, cvv, nip;

    public UsuarioR() {
    }

    public UsuarioR(int id, int idReporte, int idPago, int idAdmin, String nContrato, String nContratoR, String codigP, String correo, String contraseña, String cContraseña, String direccion, String desFalla, String nombre, String apellidop, String apellidom, String usuario, String paswoord, String apellios, String nombreP, String nContratoP, String nTargeta, String fExpedicion, String cvv, String nip) {
        Id = id;
        this.idReporte = idReporte;
        this.idPago = idPago;
        this.idAdmin = idAdmin;
        this.nContrato = nContrato;
        this.nContratoR = nContratoR;
        this.codigP = codigP;
        this.correo = correo;
        this.contraseña = contraseña;
        this.cContraseña = cContraseña;
        this.direccion = direccion;
        this.desFalla = desFalla;
        this.nombre = nombre;
        this.apellidop = apellidop;
        this.apellidom = apellidom;
        this.usuario = usuario;
        this.paswoord = paswoord;
        this.apellios = apellios;
        this.nombreP = nombreP;
        this.nContratoP = nContratoP;
        this.nTargeta = nTargeta;
        this.fExpedicion = fExpedicion;
        this.cvv = cvv;
        this.nip = nip;
    }

    public boolean isNull(){
        if(nContrato.equals("")&&nContratoR.equals("")&&codigP.equals("")&&correo.equals("")&&contraseña.equals("")&&cContraseña.equals("")&&direccion.equals("")&&desFalla.equals("")&&nombre.equals("")&&apellidop.equals("")&&apellidom.equals("")&&usuario.equals("")&&paswoord.equals("")&&apellios.equals("")&&nombreP.equals("")&&nContratoP.equals("")&&nTargeta.equals("")&&fExpedicion.equals("")&&cvv.equals("")&&nip.equals("")){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public String toString() {
        return "UsuarioR{" +
                "Id=" + Id +
                ", idReporte=" + idReporte +
                ", idPago=" + idPago +
                ", idAdmin=" + idAdmin +
                ", nContrato='" + nContrato + '\'' +
                ", nContratoR='" + nContratoR + '\'' +
                ", codigP='" + codigP + '\'' +
                ", correo='" + correo + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", cContraseña='" + cContraseña + '\'' +
                ", direccion='" + direccion + '\'' +
                ", desFalla='" + desFalla + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidop='" + apellidop + '\'' +
                ", apellidom='" + apellidom + '\'' +
                ", usuario='" + usuario + '\'' +
                ", paswoord='" + paswoord + '\'' +
                ", apellios='" + apellios + '\'' +
                ", nombreP='" + nombreP + '\'' +
                ", nContratoP='" + nContratoP + '\'' +
                ", nTargeta='" + nTargeta + '\'' +
                ", fExpedicion='" + fExpedicion + '\'' +
                ", cvv='" + cvv + '\'' +
                ", nip='" + nip + '\'' +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getnContrato() {
        return nContrato;
    }

    public void setnContrato(String nContrato) {
        this.nContrato = nContrato;
    }

    public String getnContratoR() {
        return nContratoR;
    }

    public void setnContratoR(String nContratoR) {
        this.nContratoR = nContratoR;
    }

    public String getCodigP() {
        return codigP;
    }

    public void setCodigP(String codigP) {
        this.codigP = codigP;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getcContraseña() {
        return cContraseña;
    }

    public void setcContraseña(String cContraseña) {
        this.cContraseña = cContraseña;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDesFalla() {
        return desFalla;
    }

    public void setDesFalla(String desFalla) {
        this.desFalla = desFalla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPaswoord() {
        return paswoord;
    }

    public void setPaswoord(String paswoord) {
        this.paswoord = paswoord;
    }

    public String getApellios() {
        return apellios;
    }

    public void setApellios(String apellios) {
        this.apellios = apellios;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getnContratoP() {
        return nContratoP;
    }

    public void setnContratoP(String nContratoP) {
        this.nContratoP = nContratoP;
    }

    public String getnTargeta() {
        return nTargeta;
    }

    public void setnTargeta(String nTargeta) {
        this.nTargeta = nTargeta;
    }

    public String getfExpedicion() {
        return fExpedicion;
    }

    public void setfExpedicion(String fExpedicion) {
        this.fExpedicion = fExpedicion;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
}
