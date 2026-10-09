package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_models extends Chassis
{
	static int	MODEL_3_2		= 6;
	static int	MODEL_3_5_TURBO	= 7;

	public Stallion_models( int id )
	{
		super( id );
		carCategory = PACKAGE;

		make = MAKE_MC;
	}

	public void updatevariables()
	{
		super.updatevariables();
	}
}