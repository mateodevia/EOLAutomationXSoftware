package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EQUAL", "RULE_SEMICOLON", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'apiURL'", "'string'", "'int'", "'boolean'", "'['", "']'", "'('", "'PK,mockType'", "'mockType'", "')'", "'Entity'", "'{'", "'}'", "'URL'", "'/'", "':'", "'$'", "'?'", "'Request {'", "'Type'", "'SimpleEntity'", "'MyNumeric'", "'valor'", "'MyString'", "'MyBoolean'", "'-'", "'.'", "'E'", "'e'", "'Response'", "'Mapping'", "'value'", "'parametro'", "'Asercion'", "'elemento1'", "'elemento2'", "'Parametro'", "'nombre'", "'tipo'", "'FirstNameType'", "'LastNameType'", "'FamilyNameType'", "'FullNameType'", "'GenderType'", "'EmailAddressType'", "'PhoneType'", "'CountryType'", "'CityType'", "'CountryCodeType'", "'LatitudeType'", "'LongitudType'", "'RowNumberType'", "'BooleanType'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'Path'", "'Query'", "'Body'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_EQUAL=4;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int RULE_SEMICOLON=5;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Api";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleApi"
    // InternalMyDsl.g:65:1: entryRuleApi returns [EObject current=null] : iv_ruleApi= ruleApi EOF ;
    public final EObject entryRuleApi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApi = null;


        try {
            // InternalMyDsl.g:65:44: (iv_ruleApi= ruleApi EOF )
            // InternalMyDsl.g:66:2: iv_ruleApi= ruleApi EOF
            {
             newCompositeNode(grammarAccess.getApiRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApi=ruleApi();

            state._fsp--;

             current =iv_ruleApi; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApi"


    // $ANTLR start "ruleApi"
    // InternalMyDsl.g:72:1: ruleApi returns [EObject current=null] : ( () otherlv_1= 'apiURL' this_EQUAL_2= RULE_EQUAL ( (lv_url_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_entidades_5_0= ruleEntidad ) )* ( (lv_primitivetypes_6_0= rulePrimitiveType ) )* ( (lv_serviciosRest_7_0= ruleServicioRest ) )* ) ;
    public final EObject ruleApi() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EQUAL_2=null;
        Token this_SEMICOLON_4=null;
        AntlrDatatypeRuleToken lv_url_3_0 = null;

        EObject lv_entidades_5_0 = null;

        EObject lv_primitivetypes_6_0 = null;

        EObject lv_serviciosRest_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( () otherlv_1= 'apiURL' this_EQUAL_2= RULE_EQUAL ( (lv_url_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_entidades_5_0= ruleEntidad ) )* ( (lv_primitivetypes_6_0= rulePrimitiveType ) )* ( (lv_serviciosRest_7_0= ruleServicioRest ) )* ) )
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'apiURL' this_EQUAL_2= RULE_EQUAL ( (lv_url_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_entidades_5_0= ruleEntidad ) )* ( (lv_primitivetypes_6_0= rulePrimitiveType ) )* ( (lv_serviciosRest_7_0= ruleServicioRest ) )* )
            {
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'apiURL' this_EQUAL_2= RULE_EQUAL ( (lv_url_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_entidades_5_0= ruleEntidad ) )* ( (lv_primitivetypes_6_0= rulePrimitiveType ) )* ( (lv_serviciosRest_7_0= ruleServicioRest ) )* )
            // InternalMyDsl.g:80:3: () otherlv_1= 'apiURL' this_EQUAL_2= RULE_EQUAL ( (lv_url_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_entidades_5_0= ruleEntidad ) )* ( (lv_primitivetypes_6_0= rulePrimitiveType ) )* ( (lv_serviciosRest_7_0= ruleServicioRest ) )*
            {
            // InternalMyDsl.g:80:3: ()
            // InternalMyDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getApiAccess().getApiAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getApiAccess().getApiURLKeyword_1());
            		
            this_EQUAL_2=(Token)match(input,RULE_EQUAL,FOLLOW_4); 

            			newLeafNode(this_EQUAL_2, grammarAccess.getApiAccess().getEQUALTerminalRuleCall_2());
            		
            // InternalMyDsl.g:95:3: ( (lv_url_3_0= ruleEString ) )
            // InternalMyDsl.g:96:4: (lv_url_3_0= ruleEString )
            {
            // InternalMyDsl.g:96:4: (lv_url_3_0= ruleEString )
            // InternalMyDsl.g:97:5: lv_url_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getApiAccess().getUrlEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_url_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApiRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_6); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getApiAccess().getSEMICOLONTerminalRuleCall_4());
            		
            // InternalMyDsl.g:118:3: ( (lv_entidades_5_0= ruleEntidad ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==23||LA1_0==33) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:119:4: (lv_entidades_5_0= ruleEntidad )
            	    {
            	    // InternalMyDsl.g:119:4: (lv_entidades_5_0= ruleEntidad )
            	    // InternalMyDsl.g:120:5: lv_entidades_5_0= ruleEntidad
            	    {

            	    					newCompositeNode(grammarAccess.getApiAccess().getEntidadesEntidadParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_entidades_5_0=ruleEntidad();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getApiRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entidades",
            	    						lv_entidades_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.Entidad");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:137:3: ( (lv_primitivetypes_6_0= rulePrimitiveType ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=34 && LA2_0<=37)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:138:4: (lv_primitivetypes_6_0= rulePrimitiveType )
            	    {
            	    // InternalMyDsl.g:138:4: (lv_primitivetypes_6_0= rulePrimitiveType )
            	    // InternalMyDsl.g:139:5: lv_primitivetypes_6_0= rulePrimitiveType
            	    {

            	    					newCompositeNode(grammarAccess.getApiAccess().getPrimitivetypesPrimitiveTypeParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_primitivetypes_6_0=rulePrimitiveType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getApiRule());
            	    					}
            	    					add(
            	    						current,
            	    						"primitivetypes",
            	    						lv_primitivetypes_6_0,
            	    						"org.xtext.example.mydsl.MyDsl.PrimitiveType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMyDsl.g:156:3: ( (lv_serviciosRest_7_0= ruleServicioRest ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=66 && LA3_0<=69)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:157:4: (lv_serviciosRest_7_0= ruleServicioRest )
            	    {
            	    // InternalMyDsl.g:157:4: (lv_serviciosRest_7_0= ruleServicioRest )
            	    // InternalMyDsl.g:158:5: lv_serviciosRest_7_0= ruleServicioRest
            	    {

            	    					newCompositeNode(grammarAccess.getApiAccess().getServiciosRestServicioRestParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_serviciosRest_7_0=ruleServicioRest();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getApiRule());
            	    					}
            	    					add(
            	    						current,
            	    						"serviciosRest",
            	    						lv_serviciosRest_7_0,
            	    						"org.xtext.example.mydsl.MyDsl.ServicioRest");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApi"


    // $ANTLR start "entryRuleEntidad"
    // InternalMyDsl.g:179:1: entryRuleEntidad returns [EObject current=null] : iv_ruleEntidad= ruleEntidad EOF ;
    public final EObject entryRuleEntidad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidad = null;


        try {
            // InternalMyDsl.g:179:48: (iv_ruleEntidad= ruleEntidad EOF )
            // InternalMyDsl.g:180:2: iv_ruleEntidad= ruleEntidad EOF
            {
             newCompositeNode(grammarAccess.getEntidadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntidad=ruleEntidad();

            state._fsp--;

             current =iv_ruleEntidad; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntidad"


    // $ANTLR start "ruleEntidad"
    // InternalMyDsl.g:186:1: ruleEntidad returns [EObject current=null] : (this_SimpleEntity_0= ruleSimpleEntity | this_MockarooEntity_1= ruleMockarooEntity ) ;
    public final EObject ruleEntidad() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleEntity_0 = null;

        EObject this_MockarooEntity_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:192:2: ( (this_SimpleEntity_0= ruleSimpleEntity | this_MockarooEntity_1= ruleMockarooEntity ) )
            // InternalMyDsl.g:193:2: (this_SimpleEntity_0= ruleSimpleEntity | this_MockarooEntity_1= ruleMockarooEntity )
            {
            // InternalMyDsl.g:193:2: (this_SimpleEntity_0= ruleSimpleEntity | this_MockarooEntity_1= ruleMockarooEntity )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==33) ) {
                alt4=1;
            }
            else if ( (LA4_0==23) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:194:3: this_SimpleEntity_0= ruleSimpleEntity
                    {

                    			newCompositeNode(grammarAccess.getEntidadAccess().getSimpleEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleEntity_0=ruleSimpleEntity();

                    state._fsp--;


                    			current = this_SimpleEntity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:203:3: this_MockarooEntity_1= ruleMockarooEntity
                    {

                    			newCompositeNode(grammarAccess.getEntidadAccess().getMockarooEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MockarooEntity_1=ruleMockarooEntity();

                    state._fsp--;


                    			current = this_MockarooEntity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntidad"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalMyDsl.g:215:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalMyDsl.g:215:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalMyDsl.g:216:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalMyDsl.g:222:1: rulePrimitiveType returns [EObject current=null] : (this_MyNumeric_0= ruleMyNumeric | this_MyString_1= ruleMyString | this_MyBoolean_2= ruleMyBoolean ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject this_MyNumeric_0 = null;

        EObject this_MyString_1 = null;

        EObject this_MyBoolean_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:228:2: ( (this_MyNumeric_0= ruleMyNumeric | this_MyString_1= ruleMyString | this_MyBoolean_2= ruleMyBoolean ) )
            // InternalMyDsl.g:229:2: (this_MyNumeric_0= ruleMyNumeric | this_MyString_1= ruleMyString | this_MyBoolean_2= ruleMyBoolean )
            {
            // InternalMyDsl.g:229:2: (this_MyNumeric_0= ruleMyNumeric | this_MyString_1= ruleMyString | this_MyBoolean_2= ruleMyBoolean )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt5=1;
                }
                break;
            case 36:
                {
                alt5=2;
                }
                break;
            case 35:
            case 37:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:230:3: this_MyNumeric_0= ruleMyNumeric
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getMyNumericParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MyNumeric_0=ruleMyNumeric();

                    state._fsp--;


                    			current = this_MyNumeric_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:239:3: this_MyString_1= ruleMyString
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getMyStringParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MyString_1=ruleMyString();

                    state._fsp--;


                    			current = this_MyString_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:248:3: this_MyBoolean_2= ruleMyBoolean
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getMyBooleanParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MyBoolean_2=ruleMyBoolean();

                    state._fsp--;


                    			current = this_MyBoolean_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleAtributo"
    // InternalMyDsl.g:260:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalMyDsl.g:260:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalMyDsl.g:261:2: iv_ruleAtributo= ruleAtributo EOF
            {
             newCompositeNode(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtributo=ruleAtributo();

            state._fsp--;

             current =iv_ruleAtributo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // InternalMyDsl.g:267:1: ruleAtributo returns [EObject current=null] : (this_AtributoMocka_0= ruleAtributoMocka | this_AtributoArreglo_1= ruleAtributoArreglo | this_AtributoSimple_2= ruleAtributoSimple ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        EObject this_AtributoMocka_0 = null;

        EObject this_AtributoArreglo_1 = null;

        EObject this_AtributoSimple_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:273:2: ( (this_AtributoMocka_0= ruleAtributoMocka | this_AtributoArreglo_1= ruleAtributoArreglo | this_AtributoSimple_2= ruleAtributoSimple ) )
            // InternalMyDsl.g:274:2: (this_AtributoMocka_0= ruleAtributoMocka | this_AtributoArreglo_1= ruleAtributoArreglo | this_AtributoSimple_2= ruleAtributoSimple )
            {
            // InternalMyDsl.g:274:2: (this_AtributoMocka_0= ruleAtributoMocka | this_AtributoArreglo_1= ruleAtributoArreglo | this_AtributoSimple_2= ruleAtributoSimple )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    alt6=2;
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA6_5 = input.LA(3);

                    if ( (LA6_5==19) ) {
                        alt6=1;
                    }
                    else if ( (LA6_5==RULE_SEMICOLON) ) {
                        alt6=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA6_6 = input.LA(3);

                    if ( (LA6_6==RULE_SEMICOLON) ) {
                        alt6=3;
                    }
                    else if ( (LA6_6==19) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

                }
                break;
            case 15:
                {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    alt6=2;
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA6_5 = input.LA(3);

                    if ( (LA6_5==19) ) {
                        alt6=1;
                    }
                    else if ( (LA6_5==RULE_SEMICOLON) ) {
                        alt6=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA6_6 = input.LA(3);

                    if ( (LA6_6==RULE_SEMICOLON) ) {
                        alt6=3;
                    }
                    else if ( (LA6_6==19) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }

                }
                break;
            case 16:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    int LA6_5 = input.LA(3);

                    if ( (LA6_5==19) ) {
                        alt6=1;
                    }
                    else if ( (LA6_5==RULE_SEMICOLON) ) {
                        alt6=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA6_6 = input.LA(3);

                    if ( (LA6_6==RULE_SEMICOLON) ) {
                        alt6=3;
                    }
                    else if ( (LA6_6==19) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case 17:
                    {
                    alt6=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:275:3: this_AtributoMocka_0= ruleAtributoMocka
                    {

                    			newCompositeNode(grammarAccess.getAtributoAccess().getAtributoMockaParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtributoMocka_0=ruleAtributoMocka();

                    state._fsp--;


                    			current = this_AtributoMocka_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:284:3: this_AtributoArreglo_1= ruleAtributoArreglo
                    {

                    			newCompositeNode(grammarAccess.getAtributoAccess().getAtributoArregloParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtributoArreglo_1=ruleAtributoArreglo();

                    state._fsp--;


                    			current = this_AtributoArreglo_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:293:3: this_AtributoSimple_2= ruleAtributoSimple
                    {

                    			newCompositeNode(grammarAccess.getAtributoAccess().getAtributoSimpleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtributoSimple_2=ruleAtributoSimple();

                    state._fsp--;


                    			current = this_AtributoSimple_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRuleAtributo2"
    // InternalMyDsl.g:305:1: entryRuleAtributo2 returns [EObject current=null] : iv_ruleAtributo2= ruleAtributo2 EOF ;
    public final EObject entryRuleAtributo2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo2 = null;


        try {
            // InternalMyDsl.g:305:50: (iv_ruleAtributo2= ruleAtributo2 EOF )
            // InternalMyDsl.g:306:2: iv_ruleAtributo2= ruleAtributo2 EOF
            {
             newCompositeNode(grammarAccess.getAtributo2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtributo2=ruleAtributo2();

            state._fsp--;

             current =iv_ruleAtributo2; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtributo2"


    // $ANTLR start "ruleAtributo2"
    // InternalMyDsl.g:312:1: ruleAtributo2 returns [EObject current=null] : ( (this_ID_0= RULE_ID | otherlv_1= 'string' | otherlv_2= 'int' | otherlv_3= 'boolean' ) (otherlv_4= '[' otherlv_5= ']' )? ) ;
    public final EObject ruleAtributo2() throws RecognitionException {
        EObject current = null;

        Token this_ID_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:318:2: ( ( (this_ID_0= RULE_ID | otherlv_1= 'string' | otherlv_2= 'int' | otherlv_3= 'boolean' ) (otherlv_4= '[' otherlv_5= ']' )? ) )
            // InternalMyDsl.g:319:2: ( (this_ID_0= RULE_ID | otherlv_1= 'string' | otherlv_2= 'int' | otherlv_3= 'boolean' ) (otherlv_4= '[' otherlv_5= ']' )? )
            {
            // InternalMyDsl.g:319:2: ( (this_ID_0= RULE_ID | otherlv_1= 'string' | otherlv_2= 'int' | otherlv_3= 'boolean' ) (otherlv_4= '[' otherlv_5= ']' )? )
            // InternalMyDsl.g:320:3: (this_ID_0= RULE_ID | otherlv_1= 'string' | otherlv_2= 'int' | otherlv_3= 'boolean' ) (otherlv_4= '[' otherlv_5= ']' )?
            {
            // InternalMyDsl.g:320:3: (this_ID_0= RULE_ID | otherlv_1= 'string' | otherlv_2= 'int' | otherlv_3= 'boolean' )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 15:
                {
                alt7=3;
                }
                break;
            case 16:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:321:4: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    				newLeafNode(this_ID_0, grammarAccess.getAtributo2Access().getIDTerminalRuleCall_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:326:4: otherlv_1= 'string'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getAtributo2Access().getStringKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:331:4: otherlv_2= 'int'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getAtributo2Access().getIntKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:336:4: otherlv_3= 'boolean'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getAtributo2Access().getBooleanKeyword_0_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:341:3: (otherlv_4= '[' otherlv_5= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:342:4: otherlv_4= '[' otherlv_5= ']'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getAtributo2Access().getLeftSquareBracketKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getAtributo2Access().getRightSquareBracketKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtributo2"


    // $ANTLR start "entryRuleAtributoMocka"
    // InternalMyDsl.g:355:1: entryRuleAtributoMocka returns [EObject current=null] : iv_ruleAtributoMocka= ruleAtributoMocka EOF ;
    public final EObject entryRuleAtributoMocka() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoMocka = null;


        try {
            // InternalMyDsl.g:355:54: (iv_ruleAtributoMocka= ruleAtributoMocka EOF )
            // InternalMyDsl.g:356:2: iv_ruleAtributoMocka= ruleAtributoMocka EOF
            {
             newCompositeNode(grammarAccess.getAtributoMockaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtributoMocka=ruleAtributoMocka();

            state._fsp--;

             current =iv_ruleAtributoMocka; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtributoMocka"


    // $ANTLR start "ruleAtributoMocka"
    // InternalMyDsl.g:362:1: ruleAtributoMocka returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')' ) this_SEMICOLON_10= RULE_SEMICOLON ) ;
    public final EObject ruleAtributoMocka() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_primaryKey_3_0=null;
        Token this_EQUAL_4=null;
        Token otherlv_6=null;
        Token this_EQUAL_7=null;
        Token otherlv_9=null;
        Token this_SEMICOLON_10=null;
        Enumerator lv_tipo_0_0 = null;

        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        Enumerator lv_mockType_5_0 = null;

        Enumerator lv_mockType_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:368:2: ( ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')' ) this_SEMICOLON_10= RULE_SEMICOLON ) )
            // InternalMyDsl.g:369:2: ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')' ) this_SEMICOLON_10= RULE_SEMICOLON )
            {
            // InternalMyDsl.g:369:2: ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')' ) this_SEMICOLON_10= RULE_SEMICOLON )
            // InternalMyDsl.g:370:3: ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')' ) this_SEMICOLON_10= RULE_SEMICOLON
            {
            // InternalMyDsl.g:370:3: ( (lv_tipo_0_0= ruleTipoAtributo ) )
            // InternalMyDsl.g:371:4: (lv_tipo_0_0= ruleTipoAtributo )
            {
            // InternalMyDsl.g:371:4: (lv_tipo_0_0= ruleTipoAtributo )
            // InternalMyDsl.g:372:5: lv_tipo_0_0= ruleTipoAtributo
            {

            					newCompositeNode(grammarAccess.getAtributoMockaAccess().getTipoTipoAtributoEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_tipo_0_0=ruleTipoAtributo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoMockaRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_0_0,
            						"org.xtext.example.mydsl.MyDsl.TipoAtributo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:389:3: ( (lv_nombre_1_0= ruleEString ) )
            // InternalMyDsl.g:390:4: (lv_nombre_1_0= ruleEString )
            {
            // InternalMyDsl.g:390:4: (lv_nombre_1_0= ruleEString )
            // InternalMyDsl.g:391:5: lv_nombre_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAtributoMockaAccess().getNombreEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_nombre_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoMockaRule());
            					}
            					set(
            						current,
            						"nombre",
            						lv_nombre_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:408:3: (otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')' )
            // InternalMyDsl.g:409:4: otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')'
            {
            otherlv_2=(Token)match(input,19,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getAtributoMockaAccess().getLeftParenthesisKeyword_2_0());
            			
            // InternalMyDsl.g:413:4: ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:414:5: ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) )
                    {
                    // InternalMyDsl.g:414:5: ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) )
                    // InternalMyDsl.g:415:6: ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) )
                    {
                    // InternalMyDsl.g:415:6: ( (lv_primaryKey_3_0= 'PK,mockType' ) )
                    // InternalMyDsl.g:416:7: (lv_primaryKey_3_0= 'PK,mockType' )
                    {
                    // InternalMyDsl.g:416:7: (lv_primaryKey_3_0= 'PK,mockType' )
                    // InternalMyDsl.g:417:8: lv_primaryKey_3_0= 'PK,mockType'
                    {
                    lv_primaryKey_3_0=(Token)match(input,20,FOLLOW_3); 

                    								newLeafNode(lv_primaryKey_3_0, grammarAccess.getAtributoMockaAccess().getPrimaryKeyPKMockTypeKeyword_2_1_0_0_0());
                    							

                    								if (current==null) {
                    									current = createModelElement(grammarAccess.getAtributoMockaRule());
                    								}
                    								setWithLastConsumed(current, "primaryKey", true, "PK,mockType");
                    							

                    }


                    }

                    this_EQUAL_4=(Token)match(input,RULE_EQUAL,FOLLOW_13); 

                    						newLeafNode(this_EQUAL_4, grammarAccess.getAtributoMockaAccess().getEQUALTerminalRuleCall_2_1_0_1());
                    					
                    // InternalMyDsl.g:433:6: ( (lv_mockType_5_0= ruleMockaroo ) )
                    // InternalMyDsl.g:434:7: (lv_mockType_5_0= ruleMockaroo )
                    {
                    // InternalMyDsl.g:434:7: (lv_mockType_5_0= ruleMockaroo )
                    // InternalMyDsl.g:435:8: lv_mockType_5_0= ruleMockaroo
                    {

                    								newCompositeNode(grammarAccess.getAtributoMockaAccess().getMockTypeMockarooEnumRuleCall_2_1_0_2_0());
                    							
                    pushFollow(FOLLOW_14);
                    lv_mockType_5_0=ruleMockaroo();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getAtributoMockaRule());
                    								}
                    								set(
                    									current,
                    									"mockType",
                    									lv_mockType_5_0,
                    									"org.xtext.example.mydsl.MyDsl.Mockaroo");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:454:5: (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) )
                    {
                    // InternalMyDsl.g:454:5: (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) )
                    // InternalMyDsl.g:455:6: otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) )
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_3); 

                    						newLeafNode(otherlv_6, grammarAccess.getAtributoMockaAccess().getMockTypeKeyword_2_1_1_0());
                    					
                    this_EQUAL_7=(Token)match(input,RULE_EQUAL,FOLLOW_13); 

                    						newLeafNode(this_EQUAL_7, grammarAccess.getAtributoMockaAccess().getEQUALTerminalRuleCall_2_1_1_1());
                    					
                    // InternalMyDsl.g:463:6: ( (lv_mockType_8_0= ruleMockaroo ) )
                    // InternalMyDsl.g:464:7: (lv_mockType_8_0= ruleMockaroo )
                    {
                    // InternalMyDsl.g:464:7: (lv_mockType_8_0= ruleMockaroo )
                    // InternalMyDsl.g:465:8: lv_mockType_8_0= ruleMockaroo
                    {

                    								newCompositeNode(grammarAccess.getAtributoMockaAccess().getMockTypeMockarooEnumRuleCall_2_1_1_2_0());
                    							
                    pushFollow(FOLLOW_14);
                    lv_mockType_8_0=ruleMockaroo();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getAtributoMockaRule());
                    								}
                    								set(
                    									current,
                    									"mockType",
                    									lv_mockType_8_0,
                    									"org.xtext.example.mydsl.MyDsl.Mockaroo");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,22,FOLLOW_5); 

            				newLeafNode(otherlv_9, grammarAccess.getAtributoMockaAccess().getRightParenthesisKeyword_2_2());
            			

            }

            this_SEMICOLON_10=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_10, grammarAccess.getAtributoMockaAccess().getSEMICOLONTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtributoMocka"


    // $ANTLR start "entryRuleAtributoArreglo"
    // InternalMyDsl.g:497:1: entryRuleAtributoArreglo returns [EObject current=null] : iv_ruleAtributoArreglo= ruleAtributoArreglo EOF ;
    public final EObject entryRuleAtributoArreglo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoArreglo = null;


        try {
            // InternalMyDsl.g:497:56: (iv_ruleAtributoArreglo= ruleAtributoArreglo EOF )
            // InternalMyDsl.g:498:2: iv_ruleAtributoArreglo= ruleAtributoArreglo EOF
            {
             newCompositeNode(grammarAccess.getAtributoArregloRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtributoArreglo=ruleAtributoArreglo();

            state._fsp--;

             current =iv_ruleAtributoArreglo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtributoArreglo"


    // $ANTLR start "ruleAtributoArreglo"
    // InternalMyDsl.g:504:1: ruleAtributoArreglo returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) otherlv_1= '[' otherlv_2= ']' ( (lv_nombre_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ) ;
    public final EObject ruleAtributoArreglo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_SEMICOLON_4=null;
        Enumerator lv_tipo_0_0 = null;

        AntlrDatatypeRuleToken lv_nombre_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:510:2: ( ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) otherlv_1= '[' otherlv_2= ']' ( (lv_nombre_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ) )
            // InternalMyDsl.g:511:2: ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) otherlv_1= '[' otherlv_2= ']' ( (lv_nombre_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON )
            {
            // InternalMyDsl.g:511:2: ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) otherlv_1= '[' otherlv_2= ']' ( (lv_nombre_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON )
            // InternalMyDsl.g:512:3: ( (lv_tipo_0_0= ruleTipoAtributo ) ) otherlv_1= '[' otherlv_2= ']' ( (lv_nombre_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON
            {
            // InternalMyDsl.g:512:3: ( (lv_tipo_0_0= ruleTipoAtributo ) )
            // InternalMyDsl.g:513:4: (lv_tipo_0_0= ruleTipoAtributo )
            {
            // InternalMyDsl.g:513:4: (lv_tipo_0_0= ruleTipoAtributo )
            // InternalMyDsl.g:514:5: lv_tipo_0_0= ruleTipoAtributo
            {

            					newCompositeNode(grammarAccess.getAtributoArregloAccess().getTipoTipoAtributoEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_tipo_0_0=ruleTipoAtributo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoArregloRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_0_0,
            						"org.xtext.example.mydsl.MyDsl.TipoAtributo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getAtributoArregloAccess().getLeftSquareBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAtributoArregloAccess().getRightSquareBracketKeyword_2());
            		
            // InternalMyDsl.g:539:3: ( (lv_nombre_3_0= ruleEString ) )
            // InternalMyDsl.g:540:4: (lv_nombre_3_0= ruleEString )
            {
            // InternalMyDsl.g:540:4: (lv_nombre_3_0= ruleEString )
            // InternalMyDsl.g:541:5: lv_nombre_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAtributoArregloAccess().getNombreEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_nombre_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoArregloRule());
            					}
            					set(
            						current,
            						"nombre",
            						lv_nombre_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getAtributoArregloAccess().getSEMICOLONTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtributoArreglo"


    // $ANTLR start "entryRuleAtributoSimple"
    // InternalMyDsl.g:566:1: entryRuleAtributoSimple returns [EObject current=null] : iv_ruleAtributoSimple= ruleAtributoSimple EOF ;
    public final EObject entryRuleAtributoSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoSimple = null;


        try {
            // InternalMyDsl.g:566:55: (iv_ruleAtributoSimple= ruleAtributoSimple EOF )
            // InternalMyDsl.g:567:2: iv_ruleAtributoSimple= ruleAtributoSimple EOF
            {
             newCompositeNode(grammarAccess.getAtributoSimpleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtributoSimple=ruleAtributoSimple();

            state._fsp--;

             current =iv_ruleAtributoSimple; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtributoSimple"


    // $ANTLR start "ruleAtributoSimple"
    // InternalMyDsl.g:573:1: ruleAtributoSimple returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) this_SEMICOLON_2= RULE_SEMICOLON ) ;
    public final EObject ruleAtributoSimple() throws RecognitionException {
        EObject current = null;

        Token this_SEMICOLON_2=null;
        Enumerator lv_tipo_0_0 = null;

        AntlrDatatypeRuleToken lv_nombre_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:579:2: ( ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) this_SEMICOLON_2= RULE_SEMICOLON ) )
            // InternalMyDsl.g:580:2: ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) this_SEMICOLON_2= RULE_SEMICOLON )
            {
            // InternalMyDsl.g:580:2: ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) this_SEMICOLON_2= RULE_SEMICOLON )
            // InternalMyDsl.g:581:3: ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) this_SEMICOLON_2= RULE_SEMICOLON
            {
            // InternalMyDsl.g:581:3: ( (lv_tipo_0_0= ruleTipoAtributo ) )
            // InternalMyDsl.g:582:4: (lv_tipo_0_0= ruleTipoAtributo )
            {
            // InternalMyDsl.g:582:4: (lv_tipo_0_0= ruleTipoAtributo )
            // InternalMyDsl.g:583:5: lv_tipo_0_0= ruleTipoAtributo
            {

            					newCompositeNode(grammarAccess.getAtributoSimpleAccess().getTipoTipoAtributoEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_tipo_0_0=ruleTipoAtributo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoSimpleRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_0_0,
            						"org.xtext.example.mydsl.MyDsl.TipoAtributo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:600:3: ( (lv_nombre_1_0= ruleEString ) )
            // InternalMyDsl.g:601:4: (lv_nombre_1_0= ruleEString )
            {
            // InternalMyDsl.g:601:4: (lv_nombre_1_0= ruleEString )
            // InternalMyDsl.g:602:5: lv_nombre_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAtributoSimpleAccess().getNombreEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_nombre_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoSimpleRule());
            					}
            					set(
            						current,
            						"nombre",
            						lv_nombre_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_2=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_2, grammarAccess.getAtributoSimpleAccess().getSEMICOLONTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtributoSimple"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:627:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:627:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:628:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:634:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:640:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:641:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:641:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:642:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:650:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleMockarooEntity"
    // InternalMyDsl.g:661:1: entryRuleMockarooEntity returns [EObject current=null] : iv_ruleMockarooEntity= ruleMockarooEntity EOF ;
    public final EObject entryRuleMockarooEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMockarooEntity = null;


        try {
            // InternalMyDsl.g:661:55: (iv_ruleMockarooEntity= ruleMockarooEntity EOF )
            // InternalMyDsl.g:662:2: iv_ruleMockarooEntity= ruleMockarooEntity EOF
            {
             newCompositeNode(grammarAccess.getMockarooEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMockarooEntity=ruleMockarooEntity();

            state._fsp--;

             current =iv_ruleMockarooEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMockarooEntity"


    // $ANTLR start "ruleMockarooEntity"
    // InternalMyDsl.g:668:1: ruleMockarooEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= '}' ) ;
    public final EObject ruleMockarooEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        EObject lv_atributos_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:674:2: ( (otherlv_0= 'Entity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:675:2: (otherlv_0= 'Entity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:675:2: (otherlv_0= 'Entity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= '}' )
            // InternalMyDsl.g:676:3: otherlv_0= 'Entity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMockarooEntityAccess().getEntityKeyword_0());
            		
            // InternalMyDsl.g:680:3: ( (lv_nombre_1_0= ruleEString ) )
            // InternalMyDsl.g:681:4: (lv_nombre_1_0= ruleEString )
            {
            // InternalMyDsl.g:681:4: (lv_nombre_1_0= ruleEString )
            // InternalMyDsl.g:682:5: lv_nombre_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMockarooEntityAccess().getNombreEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_nombre_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMockarooEntityRule());
            					}
            					set(
            						current,
            						"nombre",
            						lv_nombre_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getMockarooEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:703:3: ( (lv_atributos_3_0= ruleAtributo ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=14 && LA11_0<=16)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:704:4: (lv_atributos_3_0= ruleAtributo )
            	    {
            	    // InternalMyDsl.g:704:4: (lv_atributos_3_0= ruleAtributo )
            	    // InternalMyDsl.g:705:5: lv_atributos_3_0= ruleAtributo
            	    {

            	    					newCompositeNode(grammarAccess.getMockarooEntityAccess().getAtributosAtributoParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_atributos_3_0=ruleAtributo();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMockarooEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"atributos",
            	    						lv_atributos_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Atributo");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMockarooEntityAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMockarooEntity"


    // $ANTLR start "entryRuleServicioRest"
    // InternalMyDsl.g:730:1: entryRuleServicioRest returns [EObject current=null] : iv_ruleServicioRest= ruleServicioRest EOF ;
    public final EObject entryRuleServicioRest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServicioRest = null;


        try {
            // InternalMyDsl.g:730:53: (iv_ruleServicioRest= ruleServicioRest EOF )
            // InternalMyDsl.g:731:2: iv_ruleServicioRest= ruleServicioRest EOF
            {
             newCompositeNode(grammarAccess.getServicioRestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServicioRest=ruleServicioRest();

            state._fsp--;

             current =iv_ruleServicioRest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServicioRest"


    // $ANTLR start "ruleServicioRest"
    // InternalMyDsl.g:737:1: ruleServicioRest returns [EObject current=null] : ( ( (lv_metodo_0_0= ruleTipoMetodoRest ) ) ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL otherlv_5= '/' ( (lv_url_6_0= ruleEString ) ) ( ruleEString | otherlv_8= '/' | otherlv_9= ':' | otherlv_10= '{' | otherlv_11= '}' | otherlv_12= '$' | otherlv_13= '?' )* this_SEMICOLON_14= RULE_SEMICOLON (otherlv_15= 'Request {' otherlv_16= 'Type' this_EQUAL_17= RULE_EQUAL ( ruleEString )* this_SEMICOLON_19= RULE_SEMICOLON otherlv_20= '}' )? ( (lv_response_21_0= ruleResponse ) ) otherlv_22= '}' ) ;
    public final EObject ruleServicioRest() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_EQUAL_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token this_SEMICOLON_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token this_EQUAL_17=null;
        Token this_SEMICOLON_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Enumerator lv_metodo_0_0 = null;

        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        AntlrDatatypeRuleToken lv_url_6_0 = null;

        EObject lv_response_21_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:743:2: ( ( ( (lv_metodo_0_0= ruleTipoMetodoRest ) ) ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL otherlv_5= '/' ( (lv_url_6_0= ruleEString ) ) ( ruleEString | otherlv_8= '/' | otherlv_9= ':' | otherlv_10= '{' | otherlv_11= '}' | otherlv_12= '$' | otherlv_13= '?' )* this_SEMICOLON_14= RULE_SEMICOLON (otherlv_15= 'Request {' otherlv_16= 'Type' this_EQUAL_17= RULE_EQUAL ( ruleEString )* this_SEMICOLON_19= RULE_SEMICOLON otherlv_20= '}' )? ( (lv_response_21_0= ruleResponse ) ) otherlv_22= '}' ) )
            // InternalMyDsl.g:744:2: ( ( (lv_metodo_0_0= ruleTipoMetodoRest ) ) ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL otherlv_5= '/' ( (lv_url_6_0= ruleEString ) ) ( ruleEString | otherlv_8= '/' | otherlv_9= ':' | otherlv_10= '{' | otherlv_11= '}' | otherlv_12= '$' | otherlv_13= '?' )* this_SEMICOLON_14= RULE_SEMICOLON (otherlv_15= 'Request {' otherlv_16= 'Type' this_EQUAL_17= RULE_EQUAL ( ruleEString )* this_SEMICOLON_19= RULE_SEMICOLON otherlv_20= '}' )? ( (lv_response_21_0= ruleResponse ) ) otherlv_22= '}' )
            {
            // InternalMyDsl.g:744:2: ( ( (lv_metodo_0_0= ruleTipoMetodoRest ) ) ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL otherlv_5= '/' ( (lv_url_6_0= ruleEString ) ) ( ruleEString | otherlv_8= '/' | otherlv_9= ':' | otherlv_10= '{' | otherlv_11= '}' | otherlv_12= '$' | otherlv_13= '?' )* this_SEMICOLON_14= RULE_SEMICOLON (otherlv_15= 'Request {' otherlv_16= 'Type' this_EQUAL_17= RULE_EQUAL ( ruleEString )* this_SEMICOLON_19= RULE_SEMICOLON otherlv_20= '}' )? ( (lv_response_21_0= ruleResponse ) ) otherlv_22= '}' )
            // InternalMyDsl.g:745:3: ( (lv_metodo_0_0= ruleTipoMetodoRest ) ) ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL otherlv_5= '/' ( (lv_url_6_0= ruleEString ) ) ( ruleEString | otherlv_8= '/' | otherlv_9= ':' | otherlv_10= '{' | otherlv_11= '}' | otherlv_12= '$' | otherlv_13= '?' )* this_SEMICOLON_14= RULE_SEMICOLON (otherlv_15= 'Request {' otherlv_16= 'Type' this_EQUAL_17= RULE_EQUAL ( ruleEString )* this_SEMICOLON_19= RULE_SEMICOLON otherlv_20= '}' )? ( (lv_response_21_0= ruleResponse ) ) otherlv_22= '}'
            {
            // InternalMyDsl.g:745:3: ( (lv_metodo_0_0= ruleTipoMetodoRest ) )
            // InternalMyDsl.g:746:4: (lv_metodo_0_0= ruleTipoMetodoRest )
            {
            // InternalMyDsl.g:746:4: (lv_metodo_0_0= ruleTipoMetodoRest )
            // InternalMyDsl.g:747:5: lv_metodo_0_0= ruleTipoMetodoRest
            {

            					newCompositeNode(grammarAccess.getServicioRestAccess().getMetodoTipoMetodoRestEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_metodo_0_0=ruleTipoMetodoRest();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServicioRestRule());
            					}
            					set(
            						current,
            						"metodo",
            						lv_metodo_0_0,
            						"org.xtext.example.mydsl.MyDsl.TipoMetodoRest");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:764:3: ( (lv_nombre_1_0= ruleEString ) )
            // InternalMyDsl.g:765:4: (lv_nombre_1_0= ruleEString )
            {
            // InternalMyDsl.g:765:4: (lv_nombre_1_0= ruleEString )
            // InternalMyDsl.g:766:5: lv_nombre_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServicioRestAccess().getNombreEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_nombre_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServicioRestRule());
            					}
            					set(
            						current,
            						"nombre",
            						lv_nombre_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getServicioRestAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getServicioRestAccess().getURLKeyword_3());
            		
            this_EQUAL_4=(Token)match(input,RULE_EQUAL,FOLLOW_19); 

            			newLeafNode(this_EQUAL_4, grammarAccess.getServicioRestAccess().getEQUALTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getServicioRestAccess().getSolidusKeyword_5());
            		
            // InternalMyDsl.g:799:3: ( (lv_url_6_0= ruleEString ) )
            // InternalMyDsl.g:800:4: (lv_url_6_0= ruleEString )
            {
            // InternalMyDsl.g:800:4: (lv_url_6_0= ruleEString )
            // InternalMyDsl.g:801:5: lv_url_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServicioRestAccess().getUrlEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_20);
            lv_url_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServicioRestRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_6_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:818:3: ( ruleEString | otherlv_8= '/' | otherlv_9= ':' | otherlv_10= '{' | otherlv_11= '}' | otherlv_12= '$' | otherlv_13= '?' )*
            loop12:
            do {
                int alt12=8;
                switch ( input.LA(1) ) {
                case RULE_ID:
                case RULE_STRING:
                    {
                    alt12=1;
                    }
                    break;
                case 27:
                    {
                    alt12=2;
                    }
                    break;
                case 28:
                    {
                    alt12=3;
                    }
                    break;
                case 24:
                    {
                    alt12=4;
                    }
                    break;
                case 25:
                    {
                    alt12=5;
                    }
                    break;
                case 29:
                    {
                    alt12=6;
                    }
                    break;
                case 30:
                    {
                    alt12=7;
                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:819:4: ruleEString
            	    {

            	    				newCompositeNode(grammarAccess.getServicioRestAccess().getEStringParserRuleCall_7_0());
            	    			
            	    pushFollow(FOLLOW_20);
            	    ruleEString();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:827:4: otherlv_8= '/'
            	    {
            	    otherlv_8=(Token)match(input,27,FOLLOW_20); 

            	    				newLeafNode(otherlv_8, grammarAccess.getServicioRestAccess().getSolidusKeyword_7_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:832:4: otherlv_9= ':'
            	    {
            	    otherlv_9=(Token)match(input,28,FOLLOW_20); 

            	    				newLeafNode(otherlv_9, grammarAccess.getServicioRestAccess().getColonKeyword_7_2());
            	    			

            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:837:4: otherlv_10= '{'
            	    {
            	    otherlv_10=(Token)match(input,24,FOLLOW_20); 

            	    				newLeafNode(otherlv_10, grammarAccess.getServicioRestAccess().getLeftCurlyBracketKeyword_7_3());
            	    			

            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:842:4: otherlv_11= '}'
            	    {
            	    otherlv_11=(Token)match(input,25,FOLLOW_20); 

            	    				newLeafNode(otherlv_11, grammarAccess.getServicioRestAccess().getRightCurlyBracketKeyword_7_4());
            	    			

            	    }
            	    break;
            	case 6 :
            	    // InternalMyDsl.g:847:4: otherlv_12= '$'
            	    {
            	    otherlv_12=(Token)match(input,29,FOLLOW_20); 

            	    				newLeafNode(otherlv_12, grammarAccess.getServicioRestAccess().getDollarSignKeyword_7_5());
            	    			

            	    }
            	    break;
            	case 7 :
            	    // InternalMyDsl.g:852:4: otherlv_13= '?'
            	    {
            	    otherlv_13=(Token)match(input,30,FOLLOW_20); 

            	    				newLeafNode(otherlv_13, grammarAccess.getServicioRestAccess().getQuestionMarkKeyword_7_6());
            	    			

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            this_SEMICOLON_14=(Token)match(input,RULE_SEMICOLON,FOLLOW_21); 

            			newLeafNode(this_SEMICOLON_14, grammarAccess.getServicioRestAccess().getSEMICOLONTerminalRuleCall_8());
            		
            // InternalMyDsl.g:861:3: (otherlv_15= 'Request {' otherlv_16= 'Type' this_EQUAL_17= RULE_EQUAL ( ruleEString )* this_SEMICOLON_19= RULE_SEMICOLON otherlv_20= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:862:4: otherlv_15= 'Request {' otherlv_16= 'Type' this_EQUAL_17= RULE_EQUAL ( ruleEString )* this_SEMICOLON_19= RULE_SEMICOLON otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,31,FOLLOW_22); 

                    				newLeafNode(otherlv_15, grammarAccess.getServicioRestAccess().getRequestKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getServicioRestAccess().getTypeKeyword_9_1());
                    			
                    this_EQUAL_17=(Token)match(input,RULE_EQUAL,FOLLOW_23); 

                    				newLeafNode(this_EQUAL_17, grammarAccess.getServicioRestAccess().getEQUALTerminalRuleCall_9_2());
                    			
                    // InternalMyDsl.g:874:4: ( ruleEString )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_STRING)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMyDsl.g:875:5: ruleEString
                    	    {

                    	    					newCompositeNode(grammarAccess.getServicioRestAccess().getEStringParserRuleCall_9_3());
                    	    				
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    this_SEMICOLON_19=(Token)match(input,RULE_SEMICOLON,FOLLOW_24); 

                    				newLeafNode(this_SEMICOLON_19, grammarAccess.getServicioRestAccess().getSEMICOLONTerminalRuleCall_9_4());
                    			
                    otherlv_20=(Token)match(input,25,FOLLOW_21); 

                    				newLeafNode(otherlv_20, grammarAccess.getServicioRestAccess().getRightCurlyBracketKeyword_9_5());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:892:3: ( (lv_response_21_0= ruleResponse ) )
            // InternalMyDsl.g:893:4: (lv_response_21_0= ruleResponse )
            {
            // InternalMyDsl.g:893:4: (lv_response_21_0= ruleResponse )
            // InternalMyDsl.g:894:5: lv_response_21_0= ruleResponse
            {

            					newCompositeNode(grammarAccess.getServicioRestAccess().getResponseResponseParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_24);
            lv_response_21_0=ruleResponse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServicioRestRule());
            					}
            					set(
            						current,
            						"response",
            						lv_response_21_0,
            						"org.xtext.example.mydsl.MyDsl.Response");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_22=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getServicioRestAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServicioRest"


    // $ANTLR start "entryRuleSimpleEntity"
    // InternalMyDsl.g:919:1: entryRuleSimpleEntity returns [EObject current=null] : iv_ruleSimpleEntity= ruleSimpleEntity EOF ;
    public final EObject entryRuleSimpleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleEntity = null;


        try {
            // InternalMyDsl.g:919:53: (iv_ruleSimpleEntity= ruleSimpleEntity EOF )
            // InternalMyDsl.g:920:2: iv_ruleSimpleEntity= ruleSimpleEntity EOF
            {
             newCompositeNode(grammarAccess.getSimpleEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleEntity=ruleSimpleEntity();

            state._fsp--;

             current =iv_ruleSimpleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleEntity"


    // $ANTLR start "ruleSimpleEntity"
    // InternalMyDsl.g:926:1: ruleSimpleEntity returns [EObject current=null] : (otherlv_0= 'SimpleEntity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributoSimple ) )* otherlv_4= '}' ) ;
    public final EObject ruleSimpleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        EObject lv_atributos_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:932:2: ( (otherlv_0= 'SimpleEntity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributoSimple ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:933:2: (otherlv_0= 'SimpleEntity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributoSimple ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:933:2: (otherlv_0= 'SimpleEntity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributoSimple ) )* otherlv_4= '}' )
            // InternalMyDsl.g:934:3: otherlv_0= 'SimpleEntity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributoSimple ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleEntityAccess().getSimpleEntityKeyword_0());
            		
            // InternalMyDsl.g:938:3: ( (lv_nombre_1_0= ruleEString ) )
            // InternalMyDsl.g:939:4: (lv_nombre_1_0= ruleEString )
            {
            // InternalMyDsl.g:939:4: (lv_nombre_1_0= ruleEString )
            // InternalMyDsl.g:940:5: lv_nombre_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSimpleEntityAccess().getNombreEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_nombre_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleEntityRule());
            					}
            					set(
            						current,
            						"nombre",
            						lv_nombre_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getSimpleEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:961:3: ( (lv_atributos_3_0= ruleAtributoSimple ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=14 && LA15_0<=16)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:962:4: (lv_atributos_3_0= ruleAtributoSimple )
            	    {
            	    // InternalMyDsl.g:962:4: (lv_atributos_3_0= ruleAtributoSimple )
            	    // InternalMyDsl.g:963:5: lv_atributos_3_0= ruleAtributoSimple
            	    {

            	    					newCompositeNode(grammarAccess.getSimpleEntityAccess().getAtributosAtributoSimpleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_atributos_3_0=ruleAtributoSimple();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSimpleEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"atributos",
            	    						lv_atributos_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.AtributoSimple");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSimpleEntityAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleEntity"


    // $ANTLR start "entryRuleMyNumeric"
    // InternalMyDsl.g:988:1: entryRuleMyNumeric returns [EObject current=null] : iv_ruleMyNumeric= ruleMyNumeric EOF ;
    public final EObject entryRuleMyNumeric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyNumeric = null;


        try {
            // InternalMyDsl.g:988:50: (iv_ruleMyNumeric= ruleMyNumeric EOF )
            // InternalMyDsl.g:989:2: iv_ruleMyNumeric= ruleMyNumeric EOF
            {
             newCompositeNode(grammarAccess.getMyNumericRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMyNumeric=ruleMyNumeric();

            state._fsp--;

             current =iv_ruleMyNumeric; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMyNumeric"


    // $ANTLR start "ruleMyNumeric"
    // InternalMyDsl.g:995:1: ruleMyNumeric returns [EObject current=null] : ( () otherlv_1= 'MyNumeric' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEDouble ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleMyNumeric() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_valor_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1001:2: ( ( () otherlv_1= 'MyNumeric' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEDouble ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:1002:2: ( () otherlv_1= 'MyNumeric' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEDouble ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:1002:2: ( () otherlv_1= 'MyNumeric' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEDouble ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:1003:3: () otherlv_1= 'MyNumeric' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEDouble ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:1003:3: ()
            // InternalMyDsl.g:1004:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMyNumericAccess().getMyNumericAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getMyNumericAccess().getMyNumericKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getMyNumericAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1018:3: (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEDouble ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1019:4: otherlv_3= 'valor' ( (lv_valor_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getMyNumericAccess().getValorKeyword_3_0());
                    			
                    // InternalMyDsl.g:1023:4: ( (lv_valor_4_0= ruleEDouble ) )
                    // InternalMyDsl.g:1024:5: (lv_valor_4_0= ruleEDouble )
                    {
                    // InternalMyDsl.g:1024:5: (lv_valor_4_0= ruleEDouble )
                    // InternalMyDsl.g:1025:6: lv_valor_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getMyNumericAccess().getValorEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_valor_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMyNumericRule());
                    						}
                    						set(
                    							current,
                    							"valor",
                    							lv_valor_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMyNumericAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMyNumeric"


    // $ANTLR start "entryRuleMyString"
    // InternalMyDsl.g:1051:1: entryRuleMyString returns [EObject current=null] : iv_ruleMyString= ruleMyString EOF ;
    public final EObject entryRuleMyString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyString = null;


        try {
            // InternalMyDsl.g:1051:49: (iv_ruleMyString= ruleMyString EOF )
            // InternalMyDsl.g:1052:2: iv_ruleMyString= ruleMyString EOF
            {
             newCompositeNode(grammarAccess.getMyStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMyString=ruleMyString();

            state._fsp--;

             current =iv_ruleMyString; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMyString"


    // $ANTLR start "ruleMyString"
    // InternalMyDsl.g:1058:1: ruleMyString returns [EObject current=null] : ( () otherlv_1= 'MyString' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleMyString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_valor_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1064:2: ( ( () otherlv_1= 'MyString' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:1065:2: ( () otherlv_1= 'MyString' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:1065:2: ( () otherlv_1= 'MyString' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:1066:3: () otherlv_1= 'MyString' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:1066:3: ()
            // InternalMyDsl.g:1067:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMyStringAccess().getMyStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getMyStringAccess().getMyStringKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getMyStringAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1081:3: (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1082:4: otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getMyStringAccess().getValorKeyword_3_0());
                    			
                    // InternalMyDsl.g:1086:4: ( (lv_valor_4_0= ruleEString ) )
                    // InternalMyDsl.g:1087:5: (lv_valor_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:1087:5: (lv_valor_4_0= ruleEString )
                    // InternalMyDsl.g:1088:6: lv_valor_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMyStringAccess().getValorEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_valor_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMyStringRule());
                    						}
                    						set(
                    							current,
                    							"valor",
                    							lv_valor_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMyStringAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMyString"


    // $ANTLR start "entryRuleMyBoolean"
    // InternalMyDsl.g:1114:1: entryRuleMyBoolean returns [EObject current=null] : iv_ruleMyBoolean= ruleMyBoolean EOF ;
    public final EObject entryRuleMyBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyBoolean = null;


        try {
            // InternalMyDsl.g:1114:50: (iv_ruleMyBoolean= ruleMyBoolean EOF )
            // InternalMyDsl.g:1115:2: iv_ruleMyBoolean= ruleMyBoolean EOF
            {
             newCompositeNode(grammarAccess.getMyBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMyBoolean=ruleMyBoolean();

            state._fsp--;

             current =iv_ruleMyBoolean; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMyBoolean"


    // $ANTLR start "ruleMyBoolean"
    // InternalMyDsl.g:1121:1: ruleMyBoolean returns [EObject current=null] : ( () ( (lv_valor_1_0= 'valor' ) )? otherlv_2= 'MyBoolean' ) ;
    public final EObject ruleMyBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_valor_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1127:2: ( ( () ( (lv_valor_1_0= 'valor' ) )? otherlv_2= 'MyBoolean' ) )
            // InternalMyDsl.g:1128:2: ( () ( (lv_valor_1_0= 'valor' ) )? otherlv_2= 'MyBoolean' )
            {
            // InternalMyDsl.g:1128:2: ( () ( (lv_valor_1_0= 'valor' ) )? otherlv_2= 'MyBoolean' )
            // InternalMyDsl.g:1129:3: () ( (lv_valor_1_0= 'valor' ) )? otherlv_2= 'MyBoolean'
            {
            // InternalMyDsl.g:1129:3: ()
            // InternalMyDsl.g:1130:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMyBooleanAccess().getMyBooleanAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1136:3: ( (lv_valor_1_0= 'valor' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1137:4: (lv_valor_1_0= 'valor' )
                    {
                    // InternalMyDsl.g:1137:4: (lv_valor_1_0= 'valor' )
                    // InternalMyDsl.g:1138:5: lv_valor_1_0= 'valor'
                    {
                    lv_valor_1_0=(Token)match(input,35,FOLLOW_27); 

                    					newLeafNode(lv_valor_1_0, grammarAccess.getMyBooleanAccess().getValorValorKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMyBooleanRule());
                    					}
                    					setWithLastConsumed(current, "valor", true, "valor");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getMyBooleanAccess().getMyBooleanKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMyBoolean"


    // $ANTLR start "entryRuleEDouble"
    // InternalMyDsl.g:1158:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalMyDsl.g:1158:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalMyDsl.g:1159:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalMyDsl.g:1165:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1171:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalMyDsl.g:1172:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalMyDsl.g:1172:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalMyDsl.g:1173:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalMyDsl.g:1173:3: (kw= '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1174:4: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_28); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1180:3: (this_INT_1= RULE_INT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1181:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_29); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,39,FOLLOW_30); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_31); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalMyDsl.g:1201:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=40 && LA23_0<=41)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1202:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalMyDsl.g:1202:4: (kw= 'E' | kw= 'e' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==40) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==41) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalMyDsl.g:1203:5: kw= 'E'
                            {
                            kw=(Token)match(input,40,FOLLOW_32); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:1209:5: kw= 'e'
                            {
                            kw=(Token)match(input,41,FOLLOW_32); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:1215:4: (kw= '-' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==38) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalMyDsl.g:1216:5: kw= '-'
                            {
                            kw=(Token)match(input,38,FOLLOW_30); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleResponse"
    // InternalMyDsl.g:1234:1: entryRuleResponse returns [EObject current=null] : iv_ruleResponse= ruleResponse EOF ;
    public final EObject entryRuleResponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponse = null;


        try {
            // InternalMyDsl.g:1234:49: (iv_ruleResponse= ruleResponse EOF )
            // InternalMyDsl.g:1235:2: iv_ruleResponse= ruleResponse EOF
            {
             newCompositeNode(grammarAccess.getResponseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResponse=ruleResponse();

            state._fsp--;

             current =iv_ruleResponse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResponse"


    // $ANTLR start "ruleResponse"
    // InternalMyDsl.g:1241:1: ruleResponse returns [EObject current=null] : (otherlv_0= 'Response' otherlv_1= '{' otherlv_2= 'Type' this_EQUAL_3= RULE_EQUAL ( (lv_atributos_4_0= ruleAtributo2 ) ) this_SEMICOLON_5= RULE_SEMICOLON otherlv_6= '}' ) ;
    public final EObject ruleResponse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_EQUAL_3=null;
        Token this_SEMICOLON_5=null;
        Token otherlv_6=null;
        EObject lv_atributos_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1247:2: ( (otherlv_0= 'Response' otherlv_1= '{' otherlv_2= 'Type' this_EQUAL_3= RULE_EQUAL ( (lv_atributos_4_0= ruleAtributo2 ) ) this_SEMICOLON_5= RULE_SEMICOLON otherlv_6= '}' ) )
            // InternalMyDsl.g:1248:2: (otherlv_0= 'Response' otherlv_1= '{' otherlv_2= 'Type' this_EQUAL_3= RULE_EQUAL ( (lv_atributos_4_0= ruleAtributo2 ) ) this_SEMICOLON_5= RULE_SEMICOLON otherlv_6= '}' )
            {
            // InternalMyDsl.g:1248:2: (otherlv_0= 'Response' otherlv_1= '{' otherlv_2= 'Type' this_EQUAL_3= RULE_EQUAL ( (lv_atributos_4_0= ruleAtributo2 ) ) this_SEMICOLON_5= RULE_SEMICOLON otherlv_6= '}' )
            // InternalMyDsl.g:1249:3: otherlv_0= 'Response' otherlv_1= '{' otherlv_2= 'Type' this_EQUAL_3= RULE_EQUAL ( (lv_atributos_4_0= ruleAtributo2 ) ) this_SEMICOLON_5= RULE_SEMICOLON otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getResponseAccess().getResponseKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getResponseAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getResponseAccess().getTypeKeyword_2());
            		
            this_EQUAL_3=(Token)match(input,RULE_EQUAL,FOLLOW_33); 

            			newLeafNode(this_EQUAL_3, grammarAccess.getResponseAccess().getEQUALTerminalRuleCall_3());
            		
            // InternalMyDsl.g:1265:3: ( (lv_atributos_4_0= ruleAtributo2 ) )
            // InternalMyDsl.g:1266:4: (lv_atributos_4_0= ruleAtributo2 )
            {
            // InternalMyDsl.g:1266:4: (lv_atributos_4_0= ruleAtributo2 )
            // InternalMyDsl.g:1267:5: lv_atributos_4_0= ruleAtributo2
            {

            					newCompositeNode(grammarAccess.getResponseAccess().getAtributosAtributo2ParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_5);
            lv_atributos_4_0=ruleAtributo2();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResponseRule());
            					}
            					add(
            						current,
            						"atributos",
            						lv_atributos_4_0,
            						"org.xtext.example.mydsl.MyDsl.Atributo2");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_24); 

            			newLeafNode(this_SEMICOLON_5, grammarAccess.getResponseAccess().getSEMICOLONTerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getResponseAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResponse"


    // $ANTLR start "entryRuleMapping"
    // InternalMyDsl.g:1296:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalMyDsl.g:1296:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalMyDsl.g:1297:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalMyDsl.g:1303:1: ruleMapping returns [EObject current=null] : (otherlv_0= 'Mapping' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= 'parametro' ( (lv_parametro_5_0= ruleParametro ) ) otherlv_6= '}' ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parametro_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1309:2: ( (otherlv_0= 'Mapping' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= 'parametro' ( (lv_parametro_5_0= ruleParametro ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:1310:2: (otherlv_0= 'Mapping' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= 'parametro' ( (lv_parametro_5_0= ruleParametro ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:1310:2: (otherlv_0= 'Mapping' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= 'parametro' ( (lv_parametro_5_0= ruleParametro ) ) otherlv_6= '}' )
            // InternalMyDsl.g:1311:3: otherlv_0= 'Mapping' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= 'parametro' ( (lv_parametro_5_0= ruleParametro ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getMappingKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMappingAccess().getValueKeyword_2());
            		
            // InternalMyDsl.g:1323:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1324:4: ( ruleEString )
            {
            // InternalMyDsl.g:1324:4: ( ruleEString )
            // InternalMyDsl.g:1325:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMappingAccess().getValueElementoCrossReference_3_0());
            				
            pushFollow(FOLLOW_35);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,45,FOLLOW_36); 

            			newLeafNode(otherlv_4, grammarAccess.getMappingAccess().getParametroKeyword_4());
            		
            // InternalMyDsl.g:1343:3: ( (lv_parametro_5_0= ruleParametro ) )
            // InternalMyDsl.g:1344:4: (lv_parametro_5_0= ruleParametro )
            {
            // InternalMyDsl.g:1344:4: (lv_parametro_5_0= ruleParametro )
            // InternalMyDsl.g:1345:5: lv_parametro_5_0= ruleParametro
            {

            					newCompositeNode(grammarAccess.getMappingAccess().getParametroParametroParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_24);
            lv_parametro_5_0=ruleParametro();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMappingRule());
            					}
            					set(
            						current,
            						"parametro",
            						lv_parametro_5_0,
            						"org.xtext.example.mydsl.MyDsl.Parametro");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleAsercion"
    // InternalMyDsl.g:1370:1: entryRuleAsercion returns [EObject current=null] : iv_ruleAsercion= ruleAsercion EOF ;
    public final EObject entryRuleAsercion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercion = null;


        try {
            // InternalMyDsl.g:1370:49: (iv_ruleAsercion= ruleAsercion EOF )
            // InternalMyDsl.g:1371:2: iv_ruleAsercion= ruleAsercion EOF
            {
             newCompositeNode(grammarAccess.getAsercionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsercion=ruleAsercion();

            state._fsp--;

             current =iv_ruleAsercion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAsercion"


    // $ANTLR start "ruleAsercion"
    // InternalMyDsl.g:1377:1: ruleAsercion returns [EObject current=null] : (otherlv_0= 'Asercion' otherlv_1= '{' otherlv_2= 'elemento1' ( ( ruleEString ) ) otherlv_4= 'elemento2' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleAsercion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1383:2: ( (otherlv_0= 'Asercion' otherlv_1= '{' otherlv_2= 'elemento1' ( ( ruleEString ) ) otherlv_4= 'elemento2' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:1384:2: (otherlv_0= 'Asercion' otherlv_1= '{' otherlv_2= 'elemento1' ( ( ruleEString ) ) otherlv_4= 'elemento2' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:1384:2: (otherlv_0= 'Asercion' otherlv_1= '{' otherlv_2= 'elemento1' ( ( ruleEString ) ) otherlv_4= 'elemento2' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalMyDsl.g:1385:3: otherlv_0= 'Asercion' otherlv_1= '{' otherlv_2= 'elemento1' ( ( ruleEString ) ) otherlv_4= 'elemento2' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getAsercionAccess().getAsercionKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getAsercionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAsercionAccess().getElemento1Keyword_2());
            		
            // InternalMyDsl.g:1397:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1398:4: ( ruleEString )
            {
            // InternalMyDsl.g:1398:4: ( ruleEString )
            // InternalMyDsl.g:1399:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAsercionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAsercionAccess().getElemento1ElementoCrossReference_3_0());
            				
            pushFollow(FOLLOW_38);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,48,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getAsercionAccess().getElemento2Keyword_4());
            		
            // InternalMyDsl.g:1417:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1418:4: ( ruleEString )
            {
            // InternalMyDsl.g:1418:4: ( ruleEString )
            // InternalMyDsl.g:1419:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAsercionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAsercionAccess().getElemento2ElementoCrossReference_5_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAsercionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAsercion"


    // $ANTLR start "entryRuleParametro"
    // InternalMyDsl.g:1441:1: entryRuleParametro returns [EObject current=null] : iv_ruleParametro= ruleParametro EOF ;
    public final EObject entryRuleParametro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametro = null;


        try {
            // InternalMyDsl.g:1441:50: (iv_ruleParametro= ruleParametro EOF )
            // InternalMyDsl.g:1442:2: iv_ruleParametro= ruleParametro EOF
            {
             newCompositeNode(grammarAccess.getParametroRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParametro=ruleParametro();

            state._fsp--;

             current =iv_ruleParametro; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParametro"


    // $ANTLR start "ruleParametro"
    // InternalMyDsl.g:1448:1: ruleParametro returns [EObject current=null] : ( () otherlv_1= 'Parametro' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'tipo' ( (lv_tipo_6_0= ruleTipoParametro ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleParametro() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_nombre_4_0 = null;

        Enumerator lv_tipo_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1454:2: ( ( () otherlv_1= 'Parametro' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'tipo' ( (lv_tipo_6_0= ruleTipoParametro ) ) )? otherlv_7= '}' ) )
            // InternalMyDsl.g:1455:2: ( () otherlv_1= 'Parametro' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'tipo' ( (lv_tipo_6_0= ruleTipoParametro ) ) )? otherlv_7= '}' )
            {
            // InternalMyDsl.g:1455:2: ( () otherlv_1= 'Parametro' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'tipo' ( (lv_tipo_6_0= ruleTipoParametro ) ) )? otherlv_7= '}' )
            // InternalMyDsl.g:1456:3: () otherlv_1= 'Parametro' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'tipo' ( (lv_tipo_6_0= ruleTipoParametro ) ) )? otherlv_7= '}'
            {
            // InternalMyDsl.g:1456:3: ()
            // InternalMyDsl.g:1457:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParametroAccess().getParametroAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getParametroAccess().getParametroKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getParametroAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1471:3: (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==50) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1472:4: otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,50,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getParametroAccess().getNombreKeyword_3_0());
                    			
                    // InternalMyDsl.g:1476:4: ( (lv_nombre_4_0= ruleEString ) )
                    // InternalMyDsl.g:1477:5: (lv_nombre_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:1477:5: (lv_nombre_4_0= ruleEString )
                    // InternalMyDsl.g:1478:6: lv_nombre_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParametroAccess().getNombreEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_nombre_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParametroRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1496:3: (otherlv_5= 'tipo' ( (lv_tipo_6_0= ruleTipoParametro ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==51) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1497:4: otherlv_5= 'tipo' ( (lv_tipo_6_0= ruleTipoParametro ) )
                    {
                    otherlv_5=(Token)match(input,51,FOLLOW_41); 

                    				newLeafNode(otherlv_5, grammarAccess.getParametroAccess().getTipoKeyword_4_0());
                    			
                    // InternalMyDsl.g:1501:4: ( (lv_tipo_6_0= ruleTipoParametro ) )
                    // InternalMyDsl.g:1502:5: (lv_tipo_6_0= ruleTipoParametro )
                    {
                    // InternalMyDsl.g:1502:5: (lv_tipo_6_0= ruleTipoParametro )
                    // InternalMyDsl.g:1503:6: lv_tipo_6_0= ruleTipoParametro
                    {

                    						newCompositeNode(grammarAccess.getParametroAccess().getTipoTipoParametroEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_tipo_6_0=ruleTipoParametro();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParametroRule());
                    						}
                    						set(
                    							current,
                    							"tipo",
                    							lv_tipo_6_0,
                    							"org.xtext.example.mydsl.MyDsl.TipoParametro");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getParametroAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParametro"


    // $ANTLR start "ruleTipoAtributo"
    // InternalMyDsl.g:1529:1: ruleTipoAtributo returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) ) ;
    public final Enumerator ruleTipoAtributo() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1535:2: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) ) )
            // InternalMyDsl.g:1536:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) )
            {
            // InternalMyDsl.g:1536:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt26=1;
                }
                break;
            case 15:
                {
                alt26=2;
                }
                break;
            case 16:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1537:3: (enumLiteral_0= 'string' )
                    {
                    // InternalMyDsl.g:1537:3: (enumLiteral_0= 'string' )
                    // InternalMyDsl.g:1538:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,14,FOLLOW_2); 

                    				current = grammarAccess.getTipoAtributoAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoAtributoAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1545:3: (enumLiteral_1= 'int' )
                    {
                    // InternalMyDsl.g:1545:3: (enumLiteral_1= 'int' )
                    // InternalMyDsl.g:1546:4: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,15,FOLLOW_2); 

                    				current = grammarAccess.getTipoAtributoAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoAtributoAccess().getIntEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1553:3: (enumLiteral_2= 'boolean' )
                    {
                    // InternalMyDsl.g:1553:3: (enumLiteral_2= 'boolean' )
                    // InternalMyDsl.g:1554:4: enumLiteral_2= 'boolean'
                    {
                    enumLiteral_2=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getTipoAtributoAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTipoAtributoAccess().getBooleanEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoAtributo"


    // $ANTLR start "ruleMockaroo"
    // InternalMyDsl.g:1564:1: ruleMockaroo returns [Enumerator current=null] : ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'LastNameType' ) | (enumLiteral_2= 'FamilyNameType' ) | (enumLiteral_3= 'FullNameType' ) | (enumLiteral_4= 'GenderType' ) | (enumLiteral_5= 'EmailAddressType' ) | (enumLiteral_6= 'PhoneType' ) | (enumLiteral_7= 'CountryType' ) | (enumLiteral_8= 'CityType' ) | (enumLiteral_9= 'CountryCodeType' ) | (enumLiteral_10= 'LatitudeType' ) | (enumLiteral_11= 'LongitudType' ) | (enumLiteral_12= 'RowNumberType' ) | (enumLiteral_13= 'BooleanType' ) ) ;
    public final Enumerator ruleMockaroo() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1570:2: ( ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'LastNameType' ) | (enumLiteral_2= 'FamilyNameType' ) | (enumLiteral_3= 'FullNameType' ) | (enumLiteral_4= 'GenderType' ) | (enumLiteral_5= 'EmailAddressType' ) | (enumLiteral_6= 'PhoneType' ) | (enumLiteral_7= 'CountryType' ) | (enumLiteral_8= 'CityType' ) | (enumLiteral_9= 'CountryCodeType' ) | (enumLiteral_10= 'LatitudeType' ) | (enumLiteral_11= 'LongitudType' ) | (enumLiteral_12= 'RowNumberType' ) | (enumLiteral_13= 'BooleanType' ) ) )
            // InternalMyDsl.g:1571:2: ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'LastNameType' ) | (enumLiteral_2= 'FamilyNameType' ) | (enumLiteral_3= 'FullNameType' ) | (enumLiteral_4= 'GenderType' ) | (enumLiteral_5= 'EmailAddressType' ) | (enumLiteral_6= 'PhoneType' ) | (enumLiteral_7= 'CountryType' ) | (enumLiteral_8= 'CityType' ) | (enumLiteral_9= 'CountryCodeType' ) | (enumLiteral_10= 'LatitudeType' ) | (enumLiteral_11= 'LongitudType' ) | (enumLiteral_12= 'RowNumberType' ) | (enumLiteral_13= 'BooleanType' ) )
            {
            // InternalMyDsl.g:1571:2: ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'LastNameType' ) | (enumLiteral_2= 'FamilyNameType' ) | (enumLiteral_3= 'FullNameType' ) | (enumLiteral_4= 'GenderType' ) | (enumLiteral_5= 'EmailAddressType' ) | (enumLiteral_6= 'PhoneType' ) | (enumLiteral_7= 'CountryType' ) | (enumLiteral_8= 'CityType' ) | (enumLiteral_9= 'CountryCodeType' ) | (enumLiteral_10= 'LatitudeType' ) | (enumLiteral_11= 'LongitudType' ) | (enumLiteral_12= 'RowNumberType' ) | (enumLiteral_13= 'BooleanType' ) )
            int alt27=14;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt27=1;
                }
                break;
            case 53:
                {
                alt27=2;
                }
                break;
            case 54:
                {
                alt27=3;
                }
                break;
            case 55:
                {
                alt27=4;
                }
                break;
            case 56:
                {
                alt27=5;
                }
                break;
            case 57:
                {
                alt27=6;
                }
                break;
            case 58:
                {
                alt27=7;
                }
                break;
            case 59:
                {
                alt27=8;
                }
                break;
            case 60:
                {
                alt27=9;
                }
                break;
            case 61:
                {
                alt27=10;
                }
                break;
            case 62:
                {
                alt27=11;
                }
                break;
            case 63:
                {
                alt27=12;
                }
                break;
            case 64:
                {
                alt27=13;
                }
                break;
            case 65:
                {
                alt27=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1572:3: (enumLiteral_0= 'FirstNameType' )
                    {
                    // InternalMyDsl.g:1572:3: (enumLiteral_0= 'FirstNameType' )
                    // InternalMyDsl.g:1573:4: enumLiteral_0= 'FirstNameType'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getFirstNameTypeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMockarooAccess().getFirstNameTypeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1580:3: (enumLiteral_1= 'LastNameType' )
                    {
                    // InternalMyDsl.g:1580:3: (enumLiteral_1= 'LastNameType' )
                    // InternalMyDsl.g:1581:4: enumLiteral_1= 'LastNameType'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getLastNameTypeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMockarooAccess().getLastNameTypeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1588:3: (enumLiteral_2= 'FamilyNameType' )
                    {
                    // InternalMyDsl.g:1588:3: (enumLiteral_2= 'FamilyNameType' )
                    // InternalMyDsl.g:1589:4: enumLiteral_2= 'FamilyNameType'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getFamilyNameTypeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMockarooAccess().getFamilyNameTypeEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1596:3: (enumLiteral_3= 'FullNameType' )
                    {
                    // InternalMyDsl.g:1596:3: (enumLiteral_3= 'FullNameType' )
                    // InternalMyDsl.g:1597:4: enumLiteral_3= 'FullNameType'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getFullNameTypeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMockarooAccess().getFullNameTypeEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1604:3: (enumLiteral_4= 'GenderType' )
                    {
                    // InternalMyDsl.g:1604:3: (enumLiteral_4= 'GenderType' )
                    // InternalMyDsl.g:1605:4: enumLiteral_4= 'GenderType'
                    {
                    enumLiteral_4=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getGenderTypeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMockarooAccess().getGenderTypeEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1612:3: (enumLiteral_5= 'EmailAddressType' )
                    {
                    // InternalMyDsl.g:1612:3: (enumLiteral_5= 'EmailAddressType' )
                    // InternalMyDsl.g:1613:4: enumLiteral_5= 'EmailAddressType'
                    {
                    enumLiteral_5=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getEmailAddressTypeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getMockarooAccess().getEmailAddressTypeEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1620:3: (enumLiteral_6= 'PhoneType' )
                    {
                    // InternalMyDsl.g:1620:3: (enumLiteral_6= 'PhoneType' )
                    // InternalMyDsl.g:1621:4: enumLiteral_6= 'PhoneType'
                    {
                    enumLiteral_6=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getPhoneTypeEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getMockarooAccess().getPhoneTypeEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1628:3: (enumLiteral_7= 'CountryType' )
                    {
                    // InternalMyDsl.g:1628:3: (enumLiteral_7= 'CountryType' )
                    // InternalMyDsl.g:1629:4: enumLiteral_7= 'CountryType'
                    {
                    enumLiteral_7=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getCountryTypeEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getMockarooAccess().getCountryTypeEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:1636:3: (enumLiteral_8= 'CityType' )
                    {
                    // InternalMyDsl.g:1636:3: (enumLiteral_8= 'CityType' )
                    // InternalMyDsl.g:1637:4: enumLiteral_8= 'CityType'
                    {
                    enumLiteral_8=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getCityTypeEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getMockarooAccess().getCityTypeEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:1644:3: (enumLiteral_9= 'CountryCodeType' )
                    {
                    // InternalMyDsl.g:1644:3: (enumLiteral_9= 'CountryCodeType' )
                    // InternalMyDsl.g:1645:4: enumLiteral_9= 'CountryCodeType'
                    {
                    enumLiteral_9=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getCountryCodeTypeEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getMockarooAccess().getCountryCodeTypeEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:1652:3: (enumLiteral_10= 'LatitudeType' )
                    {
                    // InternalMyDsl.g:1652:3: (enumLiteral_10= 'LatitudeType' )
                    // InternalMyDsl.g:1653:4: enumLiteral_10= 'LatitudeType'
                    {
                    enumLiteral_10=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getLatitudeTypeEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getMockarooAccess().getLatitudeTypeEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:1660:3: (enumLiteral_11= 'LongitudType' )
                    {
                    // InternalMyDsl.g:1660:3: (enumLiteral_11= 'LongitudType' )
                    // InternalMyDsl.g:1661:4: enumLiteral_11= 'LongitudType'
                    {
                    enumLiteral_11=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getLongitudTypeEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getMockarooAccess().getLongitudTypeEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:1668:3: (enumLiteral_12= 'RowNumberType' )
                    {
                    // InternalMyDsl.g:1668:3: (enumLiteral_12= 'RowNumberType' )
                    // InternalMyDsl.g:1669:4: enumLiteral_12= 'RowNumberType'
                    {
                    enumLiteral_12=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getRowNumberTypeEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getMockarooAccess().getRowNumberTypeEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:1676:3: (enumLiteral_13= 'BooleanType' )
                    {
                    // InternalMyDsl.g:1676:3: (enumLiteral_13= 'BooleanType' )
                    // InternalMyDsl.g:1677:4: enumLiteral_13= 'BooleanType'
                    {
                    enumLiteral_13=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getBooleanTypeEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getMockarooAccess().getBooleanTypeEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMockaroo"


    // $ANTLR start "ruleTipoMetodoRest"
    // InternalMyDsl.g:1687:1: ruleTipoMetodoRest returns [Enumerator current=null] : ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) ;
    public final Enumerator ruleTipoMetodoRest() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1693:2: ( ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) )
            // InternalMyDsl.g:1694:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            {
            // InternalMyDsl.g:1694:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt28=1;
                }
                break;
            case 67:
                {
                alt28=2;
                }
                break;
            case 68:
                {
                alt28=3;
                }
                break;
            case 69:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1695:3: (enumLiteral_0= 'GET' )
                    {
                    // InternalMyDsl.g:1695:3: (enumLiteral_0= 'GET' )
                    // InternalMyDsl.g:1696:4: enumLiteral_0= 'GET'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getTipoMetodoRestAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoMetodoRestAccess().getGETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1703:3: (enumLiteral_1= 'POST' )
                    {
                    // InternalMyDsl.g:1703:3: (enumLiteral_1= 'POST' )
                    // InternalMyDsl.g:1704:4: enumLiteral_1= 'POST'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getTipoMetodoRestAccess().getPOSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoMetodoRestAccess().getPOSTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1711:3: (enumLiteral_2= 'PUT' )
                    {
                    // InternalMyDsl.g:1711:3: (enumLiteral_2= 'PUT' )
                    // InternalMyDsl.g:1712:4: enumLiteral_2= 'PUT'
                    {
                    enumLiteral_2=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getTipoMetodoRestAccess().getPUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTipoMetodoRestAccess().getPUTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1719:3: (enumLiteral_3= 'DELETE' )
                    {
                    // InternalMyDsl.g:1719:3: (enumLiteral_3= 'DELETE' )
                    // InternalMyDsl.g:1720:4: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getTipoMetodoRestAccess().getDELETEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTipoMetodoRestAccess().getDELETEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoMetodoRest"


    // $ANTLR start "ruleTipoParametro"
    // InternalMyDsl.g:1730:1: ruleTipoParametro returns [Enumerator current=null] : ( (enumLiteral_0= 'Path' ) | (enumLiteral_1= 'Query' ) | (enumLiteral_2= 'Body' ) ) ;
    public final Enumerator ruleTipoParametro() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1736:2: ( ( (enumLiteral_0= 'Path' ) | (enumLiteral_1= 'Query' ) | (enumLiteral_2= 'Body' ) ) )
            // InternalMyDsl.g:1737:2: ( (enumLiteral_0= 'Path' ) | (enumLiteral_1= 'Query' ) | (enumLiteral_2= 'Body' ) )
            {
            // InternalMyDsl.g:1737:2: ( (enumLiteral_0= 'Path' ) | (enumLiteral_1= 'Query' ) | (enumLiteral_2= 'Body' ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt29=1;
                }
                break;
            case 71:
                {
                alt29=2;
                }
                break;
            case 72:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1738:3: (enumLiteral_0= 'Path' )
                    {
                    // InternalMyDsl.g:1738:3: (enumLiteral_0= 'Path' )
                    // InternalMyDsl.g:1739:4: enumLiteral_0= 'Path'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getTipoParametroAccess().getPathEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoParametroAccess().getPathEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1746:3: (enumLiteral_1= 'Query' )
                    {
                    // InternalMyDsl.g:1746:3: (enumLiteral_1= 'Query' )
                    // InternalMyDsl.g:1747:4: enumLiteral_1= 'Query'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getTipoParametroAccess().getQueryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoParametroAccess().getQueryEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1754:3: (enumLiteral_2= 'Body' )
                    {
                    // InternalMyDsl.g:1754:3: (enumLiteral_2= 'Body' )
                    // InternalMyDsl.g:1755:4: enumLiteral_2= 'Body'
                    {
                    enumLiteral_2=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getTipoParametroAccess().getBodyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTipoParametroAccess().getBodyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoParametro"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000003E00800002L,0x000000000000003CL});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000003C00000002L,0x000000000000003CL});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000002L,0x000000000000003CL});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0xFFF0000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000201C000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000007B0000E0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000802000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000C000000100L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000100L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000100L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000000001C040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000C000002000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000002000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001C0L});

}