package java.game.cars;

import java.io.*;
import java.game.parts.bodypart.*;

public class Prime_R_taillights_dark extends Taillights
{
	public Prime_R_taillights_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Prime DLH 500 dark right taillights";
		description = "";
		brand_new_prestige_value = 87.79;

		value = tHUF2USD(149);
	}
}
