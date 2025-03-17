package com.liasantomil;

import java.util.ArrayList;
import java.util.List;

public class ListaTareas {
    private List<String> tareasPendientes = new ArrayList<>();

    public void agregarTarea(String tarea) {
        tareasPendientes.add(tarea);
    }

    public void marcarTareaComoCompletada(int indice) {
        if (indice >= 0 && indice < tareasPendientes.size()) {

            tareasPendientes.remove(indice);
        } else {

            throw new IndexOutOfBoundsException("Indice fuera del rango.");
        }

    }

    public int obtenerNumeroTareasPendientes() {
        return tareasPendientes.size();
    }
}
