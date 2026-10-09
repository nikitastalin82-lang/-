package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_FR_scissor_door extends FrontDoor
{
	public Kurumma_FR_scissor_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma scissor passenger's door";
		description = "Scissor type passenger's door for Kurumma models.";

		value = tHUF2USD(113.53);
		brand_new_prestige_value = 55.40;
	}
}
