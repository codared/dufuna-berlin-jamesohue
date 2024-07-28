package org.dufuna.com.dufuna.berlin.jamesohue.lekki.model;

import com.sun.jdi.connect.spi.TransportService;
import org.dufuna.com.dufuna.berlin.jamesohue.lekki.service.LekkiPropertyService;

public class LekkiProperty implements LekkiPropertyService {

    public LekkiProperty() {
        super();
        this.propertyId = propertyId;
        }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public int getNumberOfSittingrooms() {
        return numberOfSittingrooms;
    }

    public void setNumberOfSittingrooms(int numberOfSittingrooms) {
        this.numberOfSittingrooms = numberOfSittingrooms;
    }

    public int getNumberOfKitchens() {
        return numberOfKitchens;
    }

    public void setNumberOfKitchens(int numberOfKitchens) {
        this.numberOfKitchens = numberOfKitchens;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public int getNumberOfToilets() {
        return numberOfToilets;
    }

    public void setNumberOfToilets(int numberOfToilets) {
        this.numberOfToilets = numberOfToilets;
    }

    public String getPropertyOwner() {
        return propertyOwner;
    }

    public void setPropertyOwner(String propertyOwner) {
        this.propertyOwner = propertyOwner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidTo() {
        return validTo;
    }

    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    public int propertyId;
    public String propertyAddress;
    public String propertyType;
    public int numberOfBedrooms;
    public int numberOfSittingrooms;
    public int numberOfKitchens;
    public int numberOfBathrooms;
    public int numberOfToilets;
    public String propertyOwner;
    public String description;
    public String validFrom;
    public String validTo;



    public String toString() {
        return getPropertyType() + " is a property at " + getPropertyAddress() + "with an id of " + getPropertyId() + ".";
    }

    public boolean equals(Object obj){
        LekkiProperty lp = (LekkiProperty) obj;

        if(this.propertyId != lp.propertyId)
            return false;

        return true;

}

    public int hashCode() {
        return this.propertyId;
    }

    @Override
    public void saveProperty(Object LekkiProperty) {

    }

    @Override
    public Object getProperty() {
        return LekkiPropertyService.super.getProperty();
    }
}



