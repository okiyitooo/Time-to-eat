#include <iostream>
#include <string>

//we'll implement this
#include "PlayerTime.h"
#include "Player.h"
#include "Consumables.h"

#define MODE = 0

bool playerCanPlay = true;

int main() {
	//getPlayer name
	//Player player{*name*};
	while (playerCanPlay) {
		//ask player what they want to eat
		//give  options from fridge
		//ask Player what they want to do
		//give list of activities
		//Time passes
		std::cout << "Infinite loop" << std::endl;
		std::cin >> std::string(" ");
	}
	std::cout << "The end" <<std::endl;
	return 0;
}