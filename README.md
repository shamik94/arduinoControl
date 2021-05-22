# PC media controller using Mobile via Bluetooth communication using Arduino and Home Automation. 
Controlling the PC Keyboard from android phone using bluetooth module (HC-06 ) 

# Components : 
Arduino Uno ( ATMEGA328P )
4-set relay RK-3205
HC – 06 Bluetooth Module
Android Application for Bluetooth Communication
Media Playing Device with Serial Communication ports
Home Appliance

# Circuitry
![Screen Shot 2021-05-23 at 1 55 58 AM](https://user-images.githubusercontent.com/8223631/119239947-4a281380-bb6a-11eb-8fb6-89e18495f3e8.png)
![Screen Shot 2021-05-23 at 1 56 06 AM](https://user-images.githubusercontent.com/8223631/119239945-48f6e680-bb6a-11eb-8c98-837e41224f52.png)

# Programming the Arduino Uno:		
The user sends either “1” or “0” through his Bluetooth terminal mobile application.
Check if Bluetooth data is available.
If it is available, It checks whether the data is “1” or “0”.
If data is one, the 13th LED Pin is made high and “1” is printed on the serial monitor as well.
The serial monitor uses a certain COM port for communication.

# Algorithm
![Screen Shot 2021-05-23 at 1 56 46 AM](https://user-images.githubusercontent.com/8223631/119239942-44323280-bb6a-11eb-8641-7881fe0689ba.png)

# The Java Application
A java application runs in the background which continuously monitors the same COM port that the Arduino serial monitor uses.
If data is detected, an instance of RobotClass.java is initiated.
We can control the entire keyboard using the Robot class which is present in java. 


