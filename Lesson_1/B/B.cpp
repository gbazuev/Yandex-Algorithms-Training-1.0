#include <iostream>

std::string checkTriangle(int a, int b, int c) {
	if ((a + b) > c && (b + c) > a && (a + c) > b) {
		return "YES";
	}
	return "NO";
}

int main() {
	int a, b, c;
	std::cin >> a >> b >> c;
	std::cout << checkTriangle(a, b, c);
	return EXIT_SUCCESS;
}
