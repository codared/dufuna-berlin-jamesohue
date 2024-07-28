package org.dufuna.com.dufuna.berlin.jamesohue.lekki.service;

import org.dufuna.com.dufuna.berlin.jamesohue.lekki.model.LekkiProperty;

public interface LekkiPropertyService {

   void saveProperty(Object LekkiProperty);

   default Object getProperty() {
      return new LekkiProperty();
   }
}

