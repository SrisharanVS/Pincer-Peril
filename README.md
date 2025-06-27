# Pincer Peril - 2D Platformer Game

A Java-based 2D platformer game featuring dynamic gameplay, enemy interactions, smooth animations, and engaging combat mechanics. Built with pure Java and AWT/Swing for graphics rendering.

![Game Screenshot](docs/images/game_screenshot.png)

## 🎮 Game Features

### Player Controls
- **Movement**: A/D keys for left/right movement
- **Jump**: W key for jumping
- **Attack**: Left mouse button for melee attacks
- **Shoot**: C key for ranged attacks
- **Pause**: ESC key to pause the game

### Core Gameplay Mechanics
- **Smooth Player Movement**: Fluid character animations with idle, running, jumping, falling, and attack states
- **Combat System**: Melee attacks with collision detection and ranged shooting mechanics
- **Enemy AI**: Intelligent Crabby enemies with movement patterns and attack behaviors
- **Health System**: Player health bar with damage mechanics
- **Level Design**: Tile-based level system with collision detection
- **Parallax Background**: Dynamic cloud scrolling for immersive atmosphere
- **Game States**: Menu, playing, pause, and game over states

### Technical Features
- **Game Loop**: Optimized 120 FPS rendering with 200 UPS updates
- **Collision Detection**: Precise hitbox-based collision system
- **Animation System**: Sprite-based animations with configurable speeds
- **Resource Management**: Efficient loading and caching of game assets
- **Scalable Graphics**: 2x scale factor for crisp pixel art display

## 🏗️ Project Structure

```
Pincer-Peril/
├── src/
│   ├── main/           # Core game engine
│   │   ├── Game.java           # Main game loop and state management
│   │   ├── GamePanel.java      # Rendering panel
│   │   ├── GameWindow.java     # Game window setup
│   │   └── MainClass.java      # Entry point
│   ├── entities/       # Game objects
│   │   ├── Player.java         # Player character with movement and combat
│   │   ├── Enemy.java          # Base enemy class
│   │   ├── Crabby.java         # Crabby enemy implementation
│   │   ├── Bullet.java         # Projectile system
│   │   └── EnemyManager.java   # Enemy management and spawning
│   ├── gamestates/     # Game state management
│   │   ├── Menu.java           # Main menu system
│   │   ├── Playing.java        # Active gameplay state
│   │   ├── Gamestate.java      # State enumeration
│   │   └── State.java          # State interface
│   ├── levels/         # Level system
│   │   ├── Level.java          # Level data structure
│   │   └── LevelManager.java   # Level loading and management
│   ├── ui/            # User interface components
│   │   ├── MenuButton.java     # Menu button system
│   │   ├── PauseOverlay.java   # Pause menu interface
│   │   ├── GameOverOverlay.java # Game over screen
│   │   └── Volume controls     # Sound and volume management
│   ├── inputs/        # Input handling
│   └── utilz/         # Utility classes
│       ├── Constants.java      # Game constants and configurations
│       ├── LoadSave.java       # Resource loading system
│       └── HelpMethods.java    # Helper functions
├── res/               # Game resources
│   ├── player_sprites.png      # Player character sprites
│   ├── crabby_sprite.png       # Enemy sprites
│   ├── level_one_data.png      # Level tile data
│   ├── background assets       # Background images and clouds
│   └── ui assets              # Menu and UI elements
├── out/               # Compiled output
└── docs/              # Documentation and screenshots
```

## 🚀 Setup Instructions

### Prerequisites
- **Java Development Kit (JDK) 21** or later
- **IntelliJ IDEA** (recommended) or another Java IDE
- **Git** for version control

### Installation Steps

1. **Clone the Repository**
   ```bash
   git clone https://github.com/SrisharanVS/Pincer-Peril.git
   cd Pincer-Peril
   ```

2. **Open in IDE**
   - Open IntelliJ IDEA
   - Select "Open" and choose the project directory
   - The project should automatically detect the Java module structure

3. **Configure Project**
   - Ensure JDK 21 is set as the project SDK
   - Mark `src/` as source root
   - Mark `res/` as resource root

4. **Run the Game**
   - Navigate to `src/main/MainClass.java`
   - Right-click and select "Run 'MainClass.main()'"
   - The game window should open and display the main menu

### Build Configuration
The project uses IntelliJ IDEA module configuration:
- Source folders: `src/` (Java source), `res/` (resources)
- Output directory: `out/`
- JDK: 21 (inherited)

## 🎯 Gameplay Guide

### Getting Started
1. **Main Menu**: Use mouse to navigate menu options
2. **Start Game**: Click "Play" to begin your adventure
3. **Controls**: Use A/D for movement, W to jump, mouse to attack, C to shoot

### Combat Tips
- **Melee Attacks**: Get close to enemies and use left mouse button
- **Ranged Combat**: Use C key to shoot projectiles from a distance
- **Health Management**: Monitor your health bar and avoid enemy attacks
- **Enemy Patterns**: Study Crabby movement patterns for effective combat

### Game Mechanics
- **Jumping**: Press W to jump, use momentum for platform navigation
- **Collision**: Solid tiles block movement, enemies can damage you
- **Scoring**: Defeat enemies to progress through levels
- **Pause**: Press ESC anytime to pause and access menu options

## 🛠️ Development

### Key Classes Overview

#### Game Engine (`src/main/`)
- **Game.java**: Core game loop with FPS/UPS management
- **GamePanel.java**: AWT panel for rendering
- **GameWindow.java**: Window management and setup

#### Player System (`src/entities/Player.java`)
- Movement physics with gravity and jumping
- Combat mechanics (melee and ranged)
- Health system and status bar
- Animation state management

#### Enemy System (`src/entities/`)
- **Enemy.java**: Base enemy class with AI patterns
- **Crabby.java**: Specific enemy implementation
- **EnemyManager.java**: Enemy spawning and management

#### Level System (`src/levels/`)
- Tile-based level loading
- Collision detection with level geometry
- Level progression management

### Adding New Features

#### New Enemy Types
1. Extend `Enemy.java` class
2. Add constants in `Constants.java`
3. Implement AI behavior in the new enemy class
4. Add to `EnemyManager.java`

#### New Levels
1. Create level data image in `res/`
2. Add level loading logic in `LevelManager.java`
3. Update level progression system

#### New Player Abilities
1. Modify `Player.java` for new mechanics
2. Add input handling in `inputs/` package
3. Update animation system if needed

## 🎨 Graphics and Assets

The game uses pixel art sprites with a 2x scale factor for crisp display:
- **Player Sprites**: 8-directional movement animations
- **Enemy Sprites**: Crabby enemy with attack animations
- **Background**: Parallax cloud system for depth
- **UI Elements**: Menu buttons, health bars, and overlays

## 🔧 Configuration

### Game Constants (`src/utilz/Constants.java`)
- **Display**: 832x448 resolution (26x14 tiles at 32px scaled)
- **Performance**: 120 FPS, 200 UPS target
- **Physics**: Gravity, jump speed, movement speed
- **Combat**: Damage values, health limits

### Scaling System
- Base tile size: 32px
- Scale factor: 2x
- Final tile size: 64px
- Game dimensions: 832x448 pixels

## 🐛 Troubleshooting

### Common Issues
1. **Game won't start**: Ensure JDK 21 is installed and configured
2. **Missing resources**: Check that `res/` folder is marked as resource root
3. **Performance issues**: Verify system meets minimum requirements
4. **Input not working**: Ensure game window has focus

### Performance Optimization
- The game targets 120 FPS for smooth gameplay
- UPS (Updates Per Second) is set to 200 for responsive controls
- Monitor console output for FPS/UPS statistics

## 📝 License

This project is open source. Feel free to contribute, modify, or distribute according to your needs.

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Test thoroughly
5. Submit a pull request

## 📞 Support

For issues, questions, or contributions:
- Create an issue on GitHub
- Contact the development team
- Check the documentation in `docs/` folder

---

**Enjoy playing Pincer Peril!** 🎮