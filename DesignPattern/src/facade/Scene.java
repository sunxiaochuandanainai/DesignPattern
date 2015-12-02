package facade;

import facade.subsystem.DVDPlayer;
import facade.subsystem.PopcornPopper;
import facade.subsystem.Screen;

public class Scene {

	public static void main(String[] args) {
		
		Screen screen = new Screen();
		DVDPlayer dvdPlayer = new DVDPlayer();
		PopcornPopper popcornPopper = new PopcornPopper();
		HomeTheaterFacade facade = new HomeTheaterFacade(dvdPlayer, popcornPopper, screen);
		
		facade.watchMovie();
		
		System.out.println("################################################");
		System.out.println("################################################");
		System.out.println("############# After One Hour ###################");
		System.out.println("################################################");
		System.out.println("################################################");
		
		facade.endMovie();
	}
	
}
