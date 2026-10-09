package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_FR_suicide_door extends FrontDoor
{
	public Kurumma_FR_suicide_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma suicide passenger's door";
		description = "Suicide type passenger's door for Kurumma models.";

		value = tHUF2USD(125.94);
		brand_new_prestige_value = 55.40;
	}
}
