package io.proj3ct.springstarter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanFromClass")
public class Apple {

    @Value("${apple.sort}")
    private String sort;
    private String color;


    public Apple(String color) {
        this.color = color;
    }

    public Apple() {

    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
