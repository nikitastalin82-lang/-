package java.game.cars;

import java.io.*;
import java.game.parts.bodypart.*;

public class Prime_FR_scissor_door extends FrontDoor
{
	public Prime_FR_scissor_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Prime DLH 500 scissor passenger's door";
		description = "";
		brand_new_prestige_value = 83.79;

		value = tHUF2USD(1000.916);
	}
}
