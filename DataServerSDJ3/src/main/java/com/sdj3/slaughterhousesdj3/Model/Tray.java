package com.sdj3.slaughterhousesdj3.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Tray {
    private int id;
    private String name;
    private List<Part> partList;
}
