package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_models extends Chassis
{
	static int	MODEL_1_8		= 8;
	static int	MODEL_GTI		= 9;

	public Remo_models( int id )
	{
		super( id );
		carCategory = PACKAGE;

		make = MAKE_EINVAGEN;
	}

	public void updatevariables()
	{
		super.updatevariables();
	}
}