package org.dufuna.com.dufuna.berlin.jamesohue.lekki;

import org.dufuna.com.dufuna.berlin.jamesohue.lekki.model.LekkiProperty;
import org.dufuna.com.dufuna.berlin.jamesohue.lekki.service.LekkiPropertyService;

public class MockLekkiPropertyApp implements LekkiPropertyService {
    void LekkiProperty() {
    }

    @Override
    public void saveProperty(Object LekkiProperty) {

    }

    @Override
    public Object getProperty() {
        return LekkiPropertyService.super.getProperty();
    }
}
