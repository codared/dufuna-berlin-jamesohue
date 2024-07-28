package org.dufuna.com.dufuna.berlin.jamesohue.lekki.service;

import org.dufuna.com.dufuna.berlin.jamesohue.lekki.model.LekkiProperty;

public class MockLekkiPropertyService  implements LekkiPropertyService  {

    @Override
    public void saveProperty(Object LekkiProperty) {
        System.out.println("MockLekkiPropertyService.saveProperty");
    }

    @Override
    public Object getProperty() {
        System.out.println("MockLekkiPropertyService.getProperty");
        return LekkiPropertyService.super.getProperty();

    }
}
