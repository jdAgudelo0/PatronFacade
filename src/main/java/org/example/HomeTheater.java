package org.example;

// Facade Class: HomeTheater
class HomeTheater {
    private Projector projector;
    private Amplifier amplifier;
    private BluRayPlayer bluRayPlayer;

    // Constructor for the HomeTheater facade class
    public HomeTheater() {
        projector = new Projector();
        amplifier = new Amplifier();
        bluRayPlayer = new BluRayPlayer();
    }

    // Method to watch a movie using the home theater system
    public void watchMovie(String movie) {
        System.out.println("Getting ready to watch a movie...");
        projector.turnOn();
        projector.selectHDMIInput();
        amplifier.turnOn();
        amplifier.selectBluetoothInput();
        amplifier.setVolume(5);
        bluRayPlayer.turnOn();
        bluRayPlayer.playMovie(movie);
    }
}