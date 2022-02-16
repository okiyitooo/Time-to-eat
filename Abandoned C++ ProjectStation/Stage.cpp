#include "Stage.h"

static std::vector<Food> Foods;
static std::vector<Activity> Activities;

Stage::Stage(int mode, Player player) : mode{ mode }, player{ player} {}
void Stage::askPlayerWhatTheyWantToDo() {
	switch (mode) {
	case 1: //easy Mode 
	{
		int start{ 0 }, end{ 8 }, next{ 9 };
		int choice{ 0 };
		std::cout << "Here's what you have in your firdge\nWhat would you like to eat " << player << "?" << std::endl;

	getFood: //liest menu again because of bad input or the player entered next
		listFoods(start, end); //list Foods
		std::cout << "Next Drawer\n";
		std::cout << "\n" << next << "next\n";
		std::cin >> choice;
		if (std::cin.fail() || choice <= start || choice > next) {
			std::cout << "Enter a valid number\n";
			std::cin.ignore();
			goto getFood;
		}
		if (choice == next) {//go to next menu
			start = end;
			end += 8;
			next = end + 1;
			goto getFood;
		}
		//player.eat(Stage::Foods[howFar]);
		start = 0, end = 8, next = 9;//reset options for Activity menu
		std::cout << "What do you want to do?\n" << std::endl;
	getActivity: //Rinse and repeat
		listActivities(start, end); //list Activities
		std::cout << "You can...\n";
		std::cout << "\n" << next << "next\n";
		std::cin >> choice;
		if (std::cin.fail() || choice <= start || choice > next) {
			std::cout << "Enter a valid number\n";
			std::cin.ignore();
			goto getActivity;
		}
		if (choice == next) {//go to next menu
			start = end;
			end += 8;
			next = end + 1;
			goto getActivity;
		}
	}
		//player.do(Stage::Activities[choice])
		break;
	case 2:
	case 3:
	case 4:
		std::cout << "NOT DONE YET!";
	}
}
void Stage::listFoods(int start, int end) {
	for (int i = start; i < std::min((int)Foods.size(),end);i++) {
		std::cout << i+1 << ". " << Foods[i] << std::endl;
	}
}
void Stage::listActivities(int start,int end) {
	for (int i = start; i < std::min((int)Activities.size(),end);i++) {
		std::cout << i+1 << ". " << Activities[i] << std::endl;
	}
}