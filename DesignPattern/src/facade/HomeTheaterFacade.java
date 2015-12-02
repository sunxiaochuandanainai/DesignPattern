package facade;

import facade.subsystem.DVDPlayer;
import facade.subsystem.PopcornPopper;
import facade.subsystem.Screen;

public class HomeTheaterFacade {

	private DVDPlayer dvdPlayer;
	private PopcornPopper popcornPopper;
	private Screen screen;
	
	
	private HomeTheaterFacade() {
		// TODO Auto-generated constructor stub
	}
	
	
	public HomeTheaterFacade(DVDPlayer dvdPlayer, PopcornPopper popcornPopper, Screen screen) {
		
		this();
		this.dvdPlayer = dvdPlayer;
		this.popcornPopper = popcornPopper;
		this.screen = screen;
	}
	
	
	public void watchMovie(){
		popcornPopper.on();
		popcornPopper.pop();
		screen.up();
		dvdPlayer.on();
		dvdPlayer.play();
	}
	
	public void endMovie(){
		dvdPlayer.stop();
		dvdPlayer.off();
		screen.down();
		popcornPopper.off();
	}
	
}
