package com.skypro.javacourse.lessons.enums;

public enum СapacityBus {
    ESPECIALLY_SMALL(0, 10),
    SMALL(10, 25),
    AVERAGE(25, 50),
    LARGE(50, 80),
    ESPECIALLY_LARGE(80, 120),
    INCORRECT(-1,-1);

    Integer capacityMin;
    Integer capacityMax;

    СapacityBus(Integer capacityMin, Integer capacityMax) {
        this.capacityMin = capacityMin;
        this.capacityMax = capacityMax;
    }

    public Integer getCapacityMin() {
        return capacityMin;
    }

    public Integer getCapacityMax() {
        return capacityMax;
    }

    @Override
    public String toString() {
        if (getCapacityMin() == 0) {
            return " до " +
                    getCapacityMax() + " посадочных мест";
        } else if (getCapacityMin()==-1){
            return " Не коректные данные";
        }else {
            return " от " +
                    getCapacityMin() + " до " + getCapacityMax() + " посадочных мест";
        }
    }
    }
