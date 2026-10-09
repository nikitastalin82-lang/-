package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_R_sideskirt extends Sideskirt
{
	public Axis_R_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis 200S right sideskirt";
		description = "The stock right sideskirt for Axis 200S models.";

		value = tHUF2USD(29.797);
		brand_new_prestige_value = 33.72;
	}
}
