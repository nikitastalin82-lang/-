package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_F_bumper_panel extends Bumper
{
	public Badge_F_bumper_panel( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge front bumper panel";
		description = "Stock front bumper panel for Badge models.";

		value = tHUF2USD(24.476);
		brand_new_prestige_value = 22.11;
	}
}
