package java.game.cars;

import java.io.*;
import java.game.parts.bodypart.*;

public class Prime_L_taillights_dark extends Taillights
{
	public Prime_L_taillights_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Prime DLH 500 dark left taillights";
		description = "";
		brand_new_prestige_value = 87.79;

		value = tHUF2USD(149);
	}
}
