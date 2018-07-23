# Arreglo kata with TDD
## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

You need an IDE to run the test in Java

Like Eclipse in Ubuntu 14.04
```
sudo add-apt-repository ppa:ubuntu-desktop/ubuntu-make
sudo apt-get update
sudo apt-get install ubuntu-make
umake ide eclipse
```
## Running the tests

To run the test just open it with the IDE and press "run all test" button

### Break down into end to end tests

Write a program that has an arrangement of 5 positions and that only lets you enter numbers greater than or equal to 20, if you get to enter a number less than 20 then you will stay there asking for numbers until the number entered is greater than or equal to 20, shows the list when finished

Feel free to change the array list in the test:

For example in test "ListIsFull"
```
		@Test
	public void ListIsFull() 
	{
		int nums[] = {26, 62, 73, 37, 45};
		
		pro.InsertValue(26);
		pro.InsertValue(62);
		pro.InsertValue(73);
		pro.InsertValue(37);
		pro.InsertValue(45);

		assertArrayEquals(nums, pro.ShowList());
	}
```

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Felix Jimenez Calvo** - *Initial work* - [FelixJimCal](https://github.com/felixjimcal)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* The people who challenge me to improve my knowledge
