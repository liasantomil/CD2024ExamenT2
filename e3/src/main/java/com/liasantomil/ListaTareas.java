package com.liasantomil;

import java.util.ArrayList;
import java.util.List;

public class ListaTareas {
    private List<String> tareasPendientes = new ArrayList<>();

    /*tareas pendientes */
    public void agregarTarea(String tarea) {
        tareasPendientes.add(tarea);
    }

    /*tareas completadas */
    public void marcarTareaComoCompletada(int indice) {
        if (indice >= 0 && indice < tareasPendientes.size()) {
            tareasPendientes.remove(indice);
        } else {
            throw new IndexOutOfBoundsException("Indice fuera del rango.");
        }
    }

    /*tamaño tareas pendientes */
    public int obtenerNumeroTareasPendientes() {
        return tareasPendientes.size();
    }
}
