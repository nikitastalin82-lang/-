package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;

public class Baiern_FR_butterfly_door extends FrontDoor
{
	public Baiern_FR_butterfly_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Baiern CoupeSport/DevilSport butterfly passenger's door";

		description = "The butterfly type stock passenger's door of the DevilSports and CopueSports except for the GT III.";

		value = tHUF2USD(242);
		brand_new_prestige_value = 32.50;
		setMaxWear(kmToMaxWear(350000.0));
	}
}
