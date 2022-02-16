#include <iostream>
#include <string>

//we'll implement this

#include "Time.h"
#include "Stage.h"
#include "Player.h"
Time p{};

int main() {
	//getPlayer name done
	//Time passes
	std::string name;
	int mode{ 0 };

	//getPlayer name
	std::cout << "Hi what is your name\n";
	std::getline(std::cin >> std::ws, name);
	std::cout << "Hi "<< name << " What mode do you want to play in ? \n1.Easy\n2.Regular\n3.challenge\n4.Hungry mode\n";
GETMODE:
	std::cin >> mode;
	if ( std::cin.fail()||mode < 1  || mode > 4) {
		std::cout << "Enter a ->NUMBER<- between 1 and 4 ";
		goto GETMODE;
	}

	Player player(name, mode);
	Stage mainStage{ mode,player };
	while (p < 24) {
		std::cout << p << std::endl;
		p += 1;
	}
	std::cout << "The end" <<std::endl;
	return 0;
}