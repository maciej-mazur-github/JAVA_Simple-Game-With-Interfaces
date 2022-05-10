package com.game;

import java.util.List;

public interface ISaveable {
    List<String> enterValues();
    List<String> write();
    void read(List<String> savedValues);

    default void saveObject(ISaveable objectToSave) {
        List<String> output = objectToSave.write();

        for(int i = 0; i < output.size(); i++) {
            System.out.println("Saving " + output.get(i) + " to storage device");
        }
    }

    default void loadToObject(ISaveable objectToLoadTo) {
        List<String> values = enterValues();
        objectToLoadTo.read(values);
    }
}
