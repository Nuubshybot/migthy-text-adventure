# Mighty Text Adventure Game

## Table of Contents
- [Description](#description)
- [Technologies](#technologies)
- [Features](#features)
- [How to Make Choices](#how-to-make-choices)
- [Installation](#installation)
- [Usage](#usage)
- [License](#license)

## Description
Mighty Text Adventure Game is an interactive text-based adventure set in Budapest, where you play as a homeless character navigating the city's streets. Your decisions shape your fate, leading to various outcomes—both good and bad. Along the way, you can collect items that influence your journey and the actions available to you.

## Technologies
- [![java][java]][java-url]
- [![maven][maven]][maven-url]
- [![docker][docker]][docker-url]

## Features
- **Interactive Storytelling**: Make choices that affect the outcome of your adventure.
- **Exploration**: Navigate through various locations in Budapest.
- **Item Collection**: Pick up and interact with items that impact your gameplay.
- **Multiple Endings**: Experience different endings based on your decisions.

## How to Make Choices
You can select choices by:
- Typing the full name of the choice.
- Entering the initial letter of the choice.
- Starting to type from the initial letter to form part of the choice.

## Installation with docker

To run the game, you'll need to have Docker installed. Follow these steps to get started:

1. Clone the repository:
   ```bash
   git clone https://github.com/Nuubshybot/migthy-text-adventure.git
   cd mighty-text-adventure 
   ```
2.  Build the Docker image:
    ```bash
    docker build -t mighty-text-adventure .
    ```
3.  Run the game:

    ```bash
    docker run -it mighty-text-adventure
    ```

## Usage

Once the game is running, follow the prompts to make decisions and navigate through the adventure. Use your creativity to explore different outcomes based on your choices!

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

[docker]: https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white
[docker-url]: https://docs.docker.com/engine/install/

[java]: https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&labelColor=ED8B00&logo=java&color=808080[Java
[java-url]: https://www.java.com/en/download/

[maven]: https://img.shields.io/badge/Maven-4%2B-ED8B00?style=for-the-badge&labelColor=ED8B00&logo=maven&color=808080[Maven
[maven-url]: https://maven.apache.org/
