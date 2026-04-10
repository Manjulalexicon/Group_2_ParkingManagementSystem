//package model;
//changed to correct package name by Manjula
package com.parkingapp.model;

//Stores customer details and their associated Vehicle.
public class Customer {
        private String name;
        private String phoneNumber;
        private Vehicle vehicle;


        public Customer(String name, String phoneNumber, Vehicle vehicle) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.vehicle = vehicle;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public Vehicle getVehicle() {
            return vehicle;
        }

        public void setVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "name='" + name + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    ", vehicle=" + vehicle +
                    '}';
        }
    }

