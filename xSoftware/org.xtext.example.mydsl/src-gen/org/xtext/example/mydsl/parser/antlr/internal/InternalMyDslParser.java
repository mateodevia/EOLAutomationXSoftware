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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EQUAL", "RULE_SEMICOLON", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'apiURL'", "'('", "'PK,mockType'", "'mockType'", "')'", "'['", "']'", "'Entity'", "'{'", "'}'", "'SimpleEntity'", "'MyNumeric'", "'valor'", "'MyString'", "'MyBoolean'", "'-'", "'.'", "'E'", "'e'", "'Response'", "'atributos'", "','", "'Mapping'", "'value'", "'parametro'", "'Asercion'", "'elemento1'", "'elemento2'", "'Parametro'", "'nombre'", "'tipo'", "'string'", "'int'", "'boolean'", "'FirstNameType'", "'LastNameType'", "'FamilyNameType'", "'FullNameType'", "'GenderType'", "'EmailAddressType'", "'PhoneType'", "'CountryType'", "'CityType'", "'CountryCodeType'", "'LatitudeType'", "'LongitudType'", "'RowNumberType'", "'BooleanType'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'Path'", "'Query'", "'Body'"
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
    public static final int RULE_ID=7;
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
    public static final int T__25=25;
    public static final int RULE_SEMICOLON=5;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=6;
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
    // InternalMyDsl.g:72:1: ruleApi returns [EObject current=null] : ( () otherlv_1= 'apiURL' this_EQUAL_2= RULE_EQUAL ( (lv_url_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_entidades_5_0= ruleEntidad ) )* ) ;
    public final EObject ruleApi() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EQUAL_2=null;
        Token this_SEMICOLON_4=null;
        AntlrDatatypeRuleToken lv_url_3_0 = null;

        EObject lv_entidades_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( () otherlv_1= 'apiURL' this_EQUAL_2= RULE_EQUAL ( (lv_url_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_entidades_5_0= ruleEntidad ) )* ) )
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'apiURL' this_EQUAL_2= RULE_EQUAL ( (lv_url_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_entidades_5_0= ruleEntidad ) )* )
            {
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'apiURL' this_EQUAL_2= RULE_EQUAL ( (lv_url_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_entidades_5_0= ruleEntidad ) )* )
            // InternalMyDsl.g:80:3: () otherlv_1= 'apiURL' this_EQUAL_2= RULE_EQUAL ( (lv_url_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_entidades_5_0= ruleEntidad ) )*
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

                if ( (LA1_0==20||LA1_0==23) ) {
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
    // InternalMyDsl.g:141:1: entryRuleEntidad returns [EObject current=null] : iv_ruleEntidad= ruleEntidad EOF ;
    public final EObject entryRuleEntidad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidad = null;


        try {
            // InternalMyDsl.g:141:48: (iv_ruleEntidad= ruleEntidad EOF )
            // InternalMyDsl.g:142:2: iv_ruleEntidad= ruleEntidad EOF
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
    // InternalMyDsl.g:148:1: ruleEntidad returns [EObject current=null] : (this_SimpleEntity_0= ruleSimpleEntity | this_MockarooEntity_1= ruleMockarooEntity ) ;
    public final EObject ruleEntidad() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleEntity_0 = null;

        EObject this_MockarooEntity_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:154:2: ( (this_SimpleEntity_0= ruleSimpleEntity | this_MockarooEntity_1= ruleMockarooEntity ) )
            // InternalMyDsl.g:155:2: (this_SimpleEntity_0= ruleSimpleEntity | this_MockarooEntity_1= ruleMockarooEntity )
            {
            // InternalMyDsl.g:155:2: (this_SimpleEntity_0= ruleSimpleEntity | this_MockarooEntity_1= ruleMockarooEntity )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==23) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:156:3: this_SimpleEntity_0= ruleSimpleEntity
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
                    // InternalMyDsl.g:165:3: this_MockarooEntity_1= ruleMockarooEntity
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


    // $ANTLR start "entryRuleAtributo"
    // InternalMyDsl.g:177:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalMyDsl.g:177:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalMyDsl.g:178:2: iv_ruleAtributo= ruleAtributo EOF
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
    // InternalMyDsl.g:184:1: ruleAtributo returns [EObject current=null] : (this_AtributoMocka_0= ruleAtributoMocka | this_AtributoArreglo_1= ruleAtributoArreglo | this_AtributoSimple_2= ruleAtributoSimple ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        EObject this_AtributoMocka_0 = null;

        EObject this_AtributoArreglo_1 = null;

        EObject this_AtributoSimple_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:190:2: ( (this_AtributoMocka_0= ruleAtributoMocka | this_AtributoArreglo_1= ruleAtributoArreglo | this_AtributoSimple_2= ruleAtributoSimple ) )
            // InternalMyDsl.g:191:2: (this_AtributoMocka_0= ruleAtributoMocka | this_AtributoArreglo_1= ruleAtributoArreglo | this_AtributoSimple_2= ruleAtributoSimple )
            {
            // InternalMyDsl.g:191:2: (this_AtributoMocka_0= ruleAtributoMocka | this_AtributoArreglo_1= ruleAtributoArreglo | this_AtributoSimple_2= ruleAtributoSimple )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4==14) ) {
                        alt3=1;
                    }
                    else if ( (LA3_4==RULE_SEMICOLON) ) {
                        alt3=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==RULE_SEMICOLON) ) {
                        alt3=3;
                    }
                    else if ( (LA3_5==14) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 18:
                    {
                    alt3=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

                }
                break;
            case 45:
                {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    alt3=2;
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4==14) ) {
                        alt3=1;
                    }
                    else if ( (LA3_4==RULE_SEMICOLON) ) {
                        alt3=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==RULE_SEMICOLON) ) {
                        alt3=3;
                    }
                    else if ( (LA3_5==14) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }

                }
                break;
            case 46:
                {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    alt3=2;
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4==14) ) {
                        alt3=1;
                    }
                    else if ( (LA3_4==RULE_SEMICOLON) ) {
                        alt3=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==RULE_SEMICOLON) ) {
                        alt3=3;
                    }
                    else if ( (LA3_5==14) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:192:3: this_AtributoMocka_0= ruleAtributoMocka
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
                    // InternalMyDsl.g:201:3: this_AtributoArreglo_1= ruleAtributoArreglo
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
                    // InternalMyDsl.g:210:3: this_AtributoSimple_2= ruleAtributoSimple
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


    // $ANTLR start "entryRuleAtributoMocka"
    // InternalMyDsl.g:222:1: entryRuleAtributoMocka returns [EObject current=null] : iv_ruleAtributoMocka= ruleAtributoMocka EOF ;
    public final EObject entryRuleAtributoMocka() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoMocka = null;


        try {
            // InternalMyDsl.g:222:54: (iv_ruleAtributoMocka= ruleAtributoMocka EOF )
            // InternalMyDsl.g:223:2: iv_ruleAtributoMocka= ruleAtributoMocka EOF
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
    // InternalMyDsl.g:229:1: ruleAtributoMocka returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')' ) this_SEMICOLON_10= RULE_SEMICOLON ) ;
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
            // InternalMyDsl.g:235:2: ( ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')' ) this_SEMICOLON_10= RULE_SEMICOLON ) )
            // InternalMyDsl.g:236:2: ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')' ) this_SEMICOLON_10= RULE_SEMICOLON )
            {
            // InternalMyDsl.g:236:2: ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')' ) this_SEMICOLON_10= RULE_SEMICOLON )
            // InternalMyDsl.g:237:3: ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')' ) this_SEMICOLON_10= RULE_SEMICOLON
            {
            // InternalMyDsl.g:237:3: ( (lv_tipo_0_0= ruleTipoAtributo ) )
            // InternalMyDsl.g:238:4: (lv_tipo_0_0= ruleTipoAtributo )
            {
            // InternalMyDsl.g:238:4: (lv_tipo_0_0= ruleTipoAtributo )
            // InternalMyDsl.g:239:5: lv_tipo_0_0= ruleTipoAtributo
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

            // InternalMyDsl.g:256:3: ( (lv_nombre_1_0= ruleEString ) )
            // InternalMyDsl.g:257:4: (lv_nombre_1_0= ruleEString )
            {
            // InternalMyDsl.g:257:4: (lv_nombre_1_0= ruleEString )
            // InternalMyDsl.g:258:5: lv_nombre_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAtributoMockaAccess().getNombreEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalMyDsl.g:275:3: (otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')' )
            // InternalMyDsl.g:276:4: otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')'
            {
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            				newLeafNode(otherlv_2, grammarAccess.getAtributoMockaAccess().getLeftParenthesisKeyword_2_0());
            			
            // InternalMyDsl.g:280:4: ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:281:5: ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) )
                    {
                    // InternalMyDsl.g:281:5: ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) )
                    // InternalMyDsl.g:282:6: ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) )
                    {
                    // InternalMyDsl.g:282:6: ( (lv_primaryKey_3_0= 'PK,mockType' ) )
                    // InternalMyDsl.g:283:7: (lv_primaryKey_3_0= 'PK,mockType' )
                    {
                    // InternalMyDsl.g:283:7: (lv_primaryKey_3_0= 'PK,mockType' )
                    // InternalMyDsl.g:284:8: lv_primaryKey_3_0= 'PK,mockType'
                    {
                    lv_primaryKey_3_0=(Token)match(input,15,FOLLOW_3); 

                    								newLeafNode(lv_primaryKey_3_0, grammarAccess.getAtributoMockaAccess().getPrimaryKeyPKMockTypeKeyword_2_1_0_0_0());
                    							

                    								if (current==null) {
                    									current = createModelElement(grammarAccess.getAtributoMockaRule());
                    								}
                    								setWithLastConsumed(current, "primaryKey", true, "PK,mockType");
                    							

                    }


                    }

                    this_EQUAL_4=(Token)match(input,RULE_EQUAL,FOLLOW_9); 

                    						newLeafNode(this_EQUAL_4, grammarAccess.getAtributoMockaAccess().getEQUALTerminalRuleCall_2_1_0_1());
                    					
                    // InternalMyDsl.g:300:6: ( (lv_mockType_5_0= ruleMockaroo ) )
                    // InternalMyDsl.g:301:7: (lv_mockType_5_0= ruleMockaroo )
                    {
                    // InternalMyDsl.g:301:7: (lv_mockType_5_0= ruleMockaroo )
                    // InternalMyDsl.g:302:8: lv_mockType_5_0= ruleMockaroo
                    {

                    								newCompositeNode(grammarAccess.getAtributoMockaAccess().getMockTypeMockarooEnumRuleCall_2_1_0_2_0());
                    							
                    pushFollow(FOLLOW_10);
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
                    // InternalMyDsl.g:321:5: (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) )
                    {
                    // InternalMyDsl.g:321:5: (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) )
                    // InternalMyDsl.g:322:6: otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_3); 

                    						newLeafNode(otherlv_6, grammarAccess.getAtributoMockaAccess().getMockTypeKeyword_2_1_1_0());
                    					
                    this_EQUAL_7=(Token)match(input,RULE_EQUAL,FOLLOW_9); 

                    						newLeafNode(this_EQUAL_7, grammarAccess.getAtributoMockaAccess().getEQUALTerminalRuleCall_2_1_1_1());
                    					
                    // InternalMyDsl.g:330:6: ( (lv_mockType_8_0= ruleMockaroo ) )
                    // InternalMyDsl.g:331:7: (lv_mockType_8_0= ruleMockaroo )
                    {
                    // InternalMyDsl.g:331:7: (lv_mockType_8_0= ruleMockaroo )
                    // InternalMyDsl.g:332:8: lv_mockType_8_0= ruleMockaroo
                    {

                    								newCompositeNode(grammarAccess.getAtributoMockaAccess().getMockTypeMockarooEnumRuleCall_2_1_1_2_0());
                    							
                    pushFollow(FOLLOW_10);
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

            otherlv_9=(Token)match(input,17,FOLLOW_5); 

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
    // InternalMyDsl.g:364:1: entryRuleAtributoArreglo returns [EObject current=null] : iv_ruleAtributoArreglo= ruleAtributoArreglo EOF ;
    public final EObject entryRuleAtributoArreglo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoArreglo = null;


        try {
            // InternalMyDsl.g:364:56: (iv_ruleAtributoArreglo= ruleAtributoArreglo EOF )
            // InternalMyDsl.g:365:2: iv_ruleAtributoArreglo= ruleAtributoArreglo EOF
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
    // InternalMyDsl.g:371:1: ruleAtributoArreglo returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) otherlv_1= '[' otherlv_2= ']' ( (lv_nombre_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ) ;
    public final EObject ruleAtributoArreglo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_SEMICOLON_4=null;
        Enumerator lv_tipo_0_0 = null;

        AntlrDatatypeRuleToken lv_nombre_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:377:2: ( ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) otherlv_1= '[' otherlv_2= ']' ( (lv_nombre_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ) )
            // InternalMyDsl.g:378:2: ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) otherlv_1= '[' otherlv_2= ']' ( (lv_nombre_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON )
            {
            // InternalMyDsl.g:378:2: ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) otherlv_1= '[' otherlv_2= ']' ( (lv_nombre_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON )
            // InternalMyDsl.g:379:3: ( (lv_tipo_0_0= ruleTipoAtributo ) ) otherlv_1= '[' otherlv_2= ']' ( (lv_nombre_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON
            {
            // InternalMyDsl.g:379:3: ( (lv_tipo_0_0= ruleTipoAtributo ) )
            // InternalMyDsl.g:380:4: (lv_tipo_0_0= ruleTipoAtributo )
            {
            // InternalMyDsl.g:380:4: (lv_tipo_0_0= ruleTipoAtributo )
            // InternalMyDsl.g:381:5: lv_tipo_0_0= ruleTipoAtributo
            {

            					newCompositeNode(grammarAccess.getAtributoArregloAccess().getTipoTipoAtributoEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getAtributoArregloAccess().getLeftSquareBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAtributoArregloAccess().getRightSquareBracketKeyword_2());
            		
            // InternalMyDsl.g:406:3: ( (lv_nombre_3_0= ruleEString ) )
            // InternalMyDsl.g:407:4: (lv_nombre_3_0= ruleEString )
            {
            // InternalMyDsl.g:407:4: (lv_nombre_3_0= ruleEString )
            // InternalMyDsl.g:408:5: lv_nombre_3_0= ruleEString
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
    // InternalMyDsl.g:433:1: entryRuleAtributoSimple returns [EObject current=null] : iv_ruleAtributoSimple= ruleAtributoSimple EOF ;
    public final EObject entryRuleAtributoSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoSimple = null;


        try {
            // InternalMyDsl.g:433:55: (iv_ruleAtributoSimple= ruleAtributoSimple EOF )
            // InternalMyDsl.g:434:2: iv_ruleAtributoSimple= ruleAtributoSimple EOF
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
    // InternalMyDsl.g:440:1: ruleAtributoSimple returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) this_SEMICOLON_2= RULE_SEMICOLON ) ;
    public final EObject ruleAtributoSimple() throws RecognitionException {
        EObject current = null;

        Token this_SEMICOLON_2=null;
        Enumerator lv_tipo_0_0 = null;

        AntlrDatatypeRuleToken lv_nombre_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:446:2: ( ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) this_SEMICOLON_2= RULE_SEMICOLON ) )
            // InternalMyDsl.g:447:2: ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) this_SEMICOLON_2= RULE_SEMICOLON )
            {
            // InternalMyDsl.g:447:2: ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) this_SEMICOLON_2= RULE_SEMICOLON )
            // InternalMyDsl.g:448:3: ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) this_SEMICOLON_2= RULE_SEMICOLON
            {
            // InternalMyDsl.g:448:3: ( (lv_tipo_0_0= ruleTipoAtributo ) )
            // InternalMyDsl.g:449:4: (lv_tipo_0_0= ruleTipoAtributo )
            {
            // InternalMyDsl.g:449:4: (lv_tipo_0_0= ruleTipoAtributo )
            // InternalMyDsl.g:450:5: lv_tipo_0_0= ruleTipoAtributo
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

            // InternalMyDsl.g:467:3: ( (lv_nombre_1_0= ruleEString ) )
            // InternalMyDsl.g:468:4: (lv_nombre_1_0= ruleEString )
            {
            // InternalMyDsl.g:468:4: (lv_nombre_1_0= ruleEString )
            // InternalMyDsl.g:469:5: lv_nombre_1_0= ruleEString
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
    // InternalMyDsl.g:494:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:494:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:495:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:501:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:507:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:508:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:508:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:509:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:517:3: this_ID_1= RULE_ID
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
    // InternalMyDsl.g:528:1: entryRuleMockarooEntity returns [EObject current=null] : iv_ruleMockarooEntity= ruleMockarooEntity EOF ;
    public final EObject entryRuleMockarooEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMockarooEntity = null;


        try {
            // InternalMyDsl.g:528:55: (iv_ruleMockarooEntity= ruleMockarooEntity EOF )
            // InternalMyDsl.g:529:2: iv_ruleMockarooEntity= ruleMockarooEntity EOF
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
    // InternalMyDsl.g:535:1: ruleMockarooEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= '}' ) ;
    public final EObject ruleMockarooEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        EObject lv_atributos_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:541:2: ( (otherlv_0= 'Entity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:542:2: (otherlv_0= 'Entity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:542:2: (otherlv_0= 'Entity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= '}' )
            // InternalMyDsl.g:543:3: otherlv_0= 'Entity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMockarooEntityAccess().getEntityKeyword_0());
            		
            // InternalMyDsl.g:547:3: ( (lv_nombre_1_0= ruleEString ) )
            // InternalMyDsl.g:548:4: (lv_nombre_1_0= ruleEString )
            {
            // InternalMyDsl.g:548:4: (lv_nombre_1_0= ruleEString )
            // InternalMyDsl.g:549:5: lv_nombre_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMockarooEntityAccess().getNombreEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_2=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getMockarooEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:570:3: ( (lv_atributos_3_0= ruleAtributo ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=44 && LA6_0<=46)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:571:4: (lv_atributos_3_0= ruleAtributo )
            	    {
            	    // InternalMyDsl.g:571:4: (lv_atributos_3_0= ruleAtributo )
            	    // InternalMyDsl.g:572:5: lv_atributos_3_0= ruleAtributo
            	    {

            	    					newCompositeNode(grammarAccess.getMockarooEntityAccess().getAtributosAtributoParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_14);
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
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

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


    // $ANTLR start "entryRuleSimpleEntity"
    // InternalMyDsl.g:597:1: entryRuleSimpleEntity returns [EObject current=null] : iv_ruleSimpleEntity= ruleSimpleEntity EOF ;
    public final EObject entryRuleSimpleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleEntity = null;


        try {
            // InternalMyDsl.g:597:53: (iv_ruleSimpleEntity= ruleSimpleEntity EOF )
            // InternalMyDsl.g:598:2: iv_ruleSimpleEntity= ruleSimpleEntity EOF
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
    // InternalMyDsl.g:604:1: ruleSimpleEntity returns [EObject current=null] : (otherlv_0= 'SimpleEntity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributoSimple ) )* otherlv_4= '}' ) ;
    public final EObject ruleSimpleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        EObject lv_atributos_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:610:2: ( (otherlv_0= 'SimpleEntity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributoSimple ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:611:2: (otherlv_0= 'SimpleEntity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributoSimple ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:611:2: (otherlv_0= 'SimpleEntity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributoSimple ) )* otherlv_4= '}' )
            // InternalMyDsl.g:612:3: otherlv_0= 'SimpleEntity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributoSimple ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleEntityAccess().getSimpleEntityKeyword_0());
            		
            // InternalMyDsl.g:616:3: ( (lv_nombre_1_0= ruleEString ) )
            // InternalMyDsl.g:617:4: (lv_nombre_1_0= ruleEString )
            {
            // InternalMyDsl.g:617:4: (lv_nombre_1_0= ruleEString )
            // InternalMyDsl.g:618:5: lv_nombre_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSimpleEntityAccess().getNombreEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_2=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getSimpleEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:639:3: ( (lv_atributos_3_0= ruleAtributoSimple ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=44 && LA7_0<=46)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:640:4: (lv_atributos_3_0= ruleAtributoSimple )
            	    {
            	    // InternalMyDsl.g:640:4: (lv_atributos_3_0= ruleAtributoSimple )
            	    // InternalMyDsl.g:641:5: lv_atributos_3_0= ruleAtributoSimple
            	    {

            	    					newCompositeNode(grammarAccess.getSimpleEntityAccess().getAtributosAtributoSimpleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_14);
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
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMyDsl.g:666:1: entryRuleMyNumeric returns [EObject current=null] : iv_ruleMyNumeric= ruleMyNumeric EOF ;
    public final EObject entryRuleMyNumeric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyNumeric = null;


        try {
            // InternalMyDsl.g:666:50: (iv_ruleMyNumeric= ruleMyNumeric EOF )
            // InternalMyDsl.g:667:2: iv_ruleMyNumeric= ruleMyNumeric EOF
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
    // InternalMyDsl.g:673:1: ruleMyNumeric returns [EObject current=null] : ( () otherlv_1= 'MyNumeric' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEDouble ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleMyNumeric() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_valor_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:679:2: ( ( () otherlv_1= 'MyNumeric' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEDouble ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:680:2: ( () otherlv_1= 'MyNumeric' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEDouble ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:680:2: ( () otherlv_1= 'MyNumeric' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEDouble ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:681:3: () otherlv_1= 'MyNumeric' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEDouble ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:681:3: ()
            // InternalMyDsl.g:682:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMyNumericAccess().getMyNumericAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getMyNumericAccess().getMyNumericKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getMyNumericAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:696:3: (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEDouble ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:697:4: otherlv_3= 'valor' ( (lv_valor_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getMyNumericAccess().getValorKeyword_3_0());
                    			
                    // InternalMyDsl.g:701:4: ( (lv_valor_4_0= ruleEDouble ) )
                    // InternalMyDsl.g:702:5: (lv_valor_4_0= ruleEDouble )
                    {
                    // InternalMyDsl.g:702:5: (lv_valor_4_0= ruleEDouble )
                    // InternalMyDsl.g:703:6: lv_valor_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getMyNumericAccess().getValorEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_17);
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

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMyDsl.g:729:1: entryRuleMyString returns [EObject current=null] : iv_ruleMyString= ruleMyString EOF ;
    public final EObject entryRuleMyString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyString = null;


        try {
            // InternalMyDsl.g:729:49: (iv_ruleMyString= ruleMyString EOF )
            // InternalMyDsl.g:730:2: iv_ruleMyString= ruleMyString EOF
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
    // InternalMyDsl.g:736:1: ruleMyString returns [EObject current=null] : ( () otherlv_1= 'MyString' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleMyString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_valor_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:742:2: ( ( () otherlv_1= 'MyString' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:743:2: ( () otherlv_1= 'MyString' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:743:2: ( () otherlv_1= 'MyString' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:744:3: () otherlv_1= 'MyString' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:744:3: ()
            // InternalMyDsl.g:745:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMyStringAccess().getMyStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getMyStringAccess().getMyStringKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getMyStringAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:759:3: (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:760:4: otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getMyStringAccess().getValorKeyword_3_0());
                    			
                    // InternalMyDsl.g:764:4: ( (lv_valor_4_0= ruleEString ) )
                    // InternalMyDsl.g:765:5: (lv_valor_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:765:5: (lv_valor_4_0= ruleEString )
                    // InternalMyDsl.g:766:6: lv_valor_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMyStringAccess().getValorEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_17);
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

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMyDsl.g:792:1: entryRuleMyBoolean returns [EObject current=null] : iv_ruleMyBoolean= ruleMyBoolean EOF ;
    public final EObject entryRuleMyBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyBoolean = null;


        try {
            // InternalMyDsl.g:792:50: (iv_ruleMyBoolean= ruleMyBoolean EOF )
            // InternalMyDsl.g:793:2: iv_ruleMyBoolean= ruleMyBoolean EOF
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
    // InternalMyDsl.g:799:1: ruleMyBoolean returns [EObject current=null] : ( () ( (lv_valor_1_0= 'valor' ) )? otherlv_2= 'MyBoolean' ) ;
    public final EObject ruleMyBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_valor_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:805:2: ( ( () ( (lv_valor_1_0= 'valor' ) )? otherlv_2= 'MyBoolean' ) )
            // InternalMyDsl.g:806:2: ( () ( (lv_valor_1_0= 'valor' ) )? otherlv_2= 'MyBoolean' )
            {
            // InternalMyDsl.g:806:2: ( () ( (lv_valor_1_0= 'valor' ) )? otherlv_2= 'MyBoolean' )
            // InternalMyDsl.g:807:3: () ( (lv_valor_1_0= 'valor' ) )? otherlv_2= 'MyBoolean'
            {
            // InternalMyDsl.g:807:3: ()
            // InternalMyDsl.g:808:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMyBooleanAccess().getMyBooleanAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:814:3: ( (lv_valor_1_0= 'valor' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:815:4: (lv_valor_1_0= 'valor' )
                    {
                    // InternalMyDsl.g:815:4: (lv_valor_1_0= 'valor' )
                    // InternalMyDsl.g:816:5: lv_valor_1_0= 'valor'
                    {
                    lv_valor_1_0=(Token)match(input,25,FOLLOW_18); 

                    					newLeafNode(lv_valor_1_0, grammarAccess.getMyBooleanAccess().getValorValorKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMyBooleanRule());
                    					}
                    					setWithLastConsumed(current, "valor", true, "valor");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,27,FOLLOW_2); 

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
    // InternalMyDsl.g:836:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalMyDsl.g:836:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalMyDsl.g:837:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalMyDsl.g:843:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:849:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalMyDsl.g:850:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalMyDsl.g:850:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalMyDsl.g:851:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalMyDsl.g:851:3: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:852:4: kw= '-'
                    {
                    kw=(Token)match(input,28,FOLLOW_19); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:858:3: (this_INT_1= RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:859:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_20); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,29,FOLLOW_21); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_22); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalMyDsl.g:879:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=30 && LA15_0<=31)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:880:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalMyDsl.g:880:4: (kw= 'E' | kw= 'e' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==30) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==31) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMyDsl.g:881:5: kw= 'E'
                            {
                            kw=(Token)match(input,30,FOLLOW_23); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:887:5: kw= 'e'
                            {
                            kw=(Token)match(input,31,FOLLOW_23); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:893:4: (kw= '-' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==28) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalMyDsl.g:894:5: kw= '-'
                            {
                            kw=(Token)match(input,28,FOLLOW_21); 

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
    // InternalMyDsl.g:912:1: entryRuleResponse returns [EObject current=null] : iv_ruleResponse= ruleResponse EOF ;
    public final EObject entryRuleResponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponse = null;


        try {
            // InternalMyDsl.g:912:49: (iv_ruleResponse= ruleResponse EOF )
            // InternalMyDsl.g:913:2: iv_ruleResponse= ruleResponse EOF
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
    // InternalMyDsl.g:919:1: ruleResponse returns [EObject current=null] : (otherlv_0= 'Response' otherlv_1= '{' otherlv_2= 'atributos' otherlv_3= '{' ( (lv_atributos_4_0= ruleAtributo ) ) (otherlv_5= ',' ( (lv_atributos_6_0= ruleAtributo ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleResponse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_atributos_4_0 = null;

        EObject lv_atributos_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:925:2: ( (otherlv_0= 'Response' otherlv_1= '{' otherlv_2= 'atributos' otherlv_3= '{' ( (lv_atributos_4_0= ruleAtributo ) ) (otherlv_5= ',' ( (lv_atributos_6_0= ruleAtributo ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalMyDsl.g:926:2: (otherlv_0= 'Response' otherlv_1= '{' otherlv_2= 'atributos' otherlv_3= '{' ( (lv_atributos_4_0= ruleAtributo ) ) (otherlv_5= ',' ( (lv_atributos_6_0= ruleAtributo ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalMyDsl.g:926:2: (otherlv_0= 'Response' otherlv_1= '{' otherlv_2= 'atributos' otherlv_3= '{' ( (lv_atributos_4_0= ruleAtributo ) ) (otherlv_5= ',' ( (lv_atributos_6_0= ruleAtributo ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalMyDsl.g:927:3: otherlv_0= 'Response' otherlv_1= '{' otherlv_2= 'atributos' otherlv_3= '{' ( (lv_atributos_4_0= ruleAtributo ) ) (otherlv_5= ',' ( (lv_atributos_6_0= ruleAtributo ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getResponseAccess().getResponseKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getResponseAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getResponseAccess().getAtributosKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getResponseAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:943:3: ( (lv_atributos_4_0= ruleAtributo ) )
            // InternalMyDsl.g:944:4: (lv_atributos_4_0= ruleAtributo )
            {
            // InternalMyDsl.g:944:4: (lv_atributos_4_0= ruleAtributo )
            // InternalMyDsl.g:945:5: lv_atributos_4_0= ruleAtributo
            {

            					newCompositeNode(grammarAccess.getResponseAccess().getAtributosAtributoParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
            lv_atributos_4_0=ruleAtributo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResponseRule());
            					}
            					add(
            						current,
            						"atributos",
            						lv_atributos_4_0,
            						"org.xtext.example.mydsl.MyDsl.Atributo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:962:3: (otherlv_5= ',' ( (lv_atributos_6_0= ruleAtributo ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==34) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:963:4: otherlv_5= ',' ( (lv_atributos_6_0= ruleAtributo ) )
            	    {
            	    otherlv_5=(Token)match(input,34,FOLLOW_25); 

            	    				newLeafNode(otherlv_5, grammarAccess.getResponseAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalMyDsl.g:967:4: ( (lv_atributos_6_0= ruleAtributo ) )
            	    // InternalMyDsl.g:968:5: (lv_atributos_6_0= ruleAtributo )
            	    {
            	    // InternalMyDsl.g:968:5: (lv_atributos_6_0= ruleAtributo )
            	    // InternalMyDsl.g:969:6: lv_atributos_6_0= ruleAtributo
            	    {

            	    						newCompositeNode(grammarAccess.getResponseAccess().getAtributosAtributoParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_atributos_6_0=ruleAtributo();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getResponseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"atributos",
            	    							lv_atributos_6_0,
            	    							"org.xtext.example.mydsl.MyDsl.Atributo");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getResponseAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getResponseAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalMyDsl.g:999:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalMyDsl.g:999:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalMyDsl.g:1000:2: iv_ruleMapping= ruleMapping EOF
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
    // InternalMyDsl.g:1006:1: ruleMapping returns [EObject current=null] : (otherlv_0= 'Mapping' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= 'parametro' ( (lv_parametro_5_0= ruleParametro ) ) otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:1012:2: ( (otherlv_0= 'Mapping' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= 'parametro' ( (lv_parametro_5_0= ruleParametro ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:1013:2: (otherlv_0= 'Mapping' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= 'parametro' ( (lv_parametro_5_0= ruleParametro ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:1013:2: (otherlv_0= 'Mapping' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= 'parametro' ( (lv_parametro_5_0= ruleParametro ) ) otherlv_6= '}' )
            // InternalMyDsl.g:1014:3: otherlv_0= 'Mapping' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= 'parametro' ( (lv_parametro_5_0= ruleParametro ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getMappingKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMappingAccess().getValueKeyword_2());
            		
            // InternalMyDsl.g:1026:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1027:4: ( ruleEString )
            {
            // InternalMyDsl.g:1027:4: ( ruleEString )
            // InternalMyDsl.g:1028:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMappingAccess().getValueElementoCrossReference_3_0());
            				
            pushFollow(FOLLOW_28);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,37,FOLLOW_29); 

            			newLeafNode(otherlv_4, grammarAccess.getMappingAccess().getParametroKeyword_4());
            		
            // InternalMyDsl.g:1046:3: ( (lv_parametro_5_0= ruleParametro ) )
            // InternalMyDsl.g:1047:4: (lv_parametro_5_0= ruleParametro )
            {
            // InternalMyDsl.g:1047:4: (lv_parametro_5_0= ruleParametro )
            // InternalMyDsl.g:1048:5: lv_parametro_5_0= ruleParametro
            {

            					newCompositeNode(grammarAccess.getMappingAccess().getParametroParametroParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMyDsl.g:1073:1: entryRuleAsercion returns [EObject current=null] : iv_ruleAsercion= ruleAsercion EOF ;
    public final EObject entryRuleAsercion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercion = null;


        try {
            // InternalMyDsl.g:1073:49: (iv_ruleAsercion= ruleAsercion EOF )
            // InternalMyDsl.g:1074:2: iv_ruleAsercion= ruleAsercion EOF
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
    // InternalMyDsl.g:1080:1: ruleAsercion returns [EObject current=null] : (otherlv_0= 'Asercion' otherlv_1= '{' otherlv_2= 'elemento1' ( ( ruleEString ) ) otherlv_4= 'elemento2' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleAsercion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1086:2: ( (otherlv_0= 'Asercion' otherlv_1= '{' otherlv_2= 'elemento1' ( ( ruleEString ) ) otherlv_4= 'elemento2' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:1087:2: (otherlv_0= 'Asercion' otherlv_1= '{' otherlv_2= 'elemento1' ( ( ruleEString ) ) otherlv_4= 'elemento2' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:1087:2: (otherlv_0= 'Asercion' otherlv_1= '{' otherlv_2= 'elemento1' ( ( ruleEString ) ) otherlv_4= 'elemento2' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalMyDsl.g:1088:3: otherlv_0= 'Asercion' otherlv_1= '{' otherlv_2= 'elemento1' ( ( ruleEString ) ) otherlv_4= 'elemento2' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getAsercionAccess().getAsercionKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getAsercionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAsercionAccess().getElemento1Keyword_2());
            		
            // InternalMyDsl.g:1100:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1101:4: ( ruleEString )
            {
            // InternalMyDsl.g:1101:4: ( ruleEString )
            // InternalMyDsl.g:1102:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAsercionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAsercionAccess().getElemento1ElementoCrossReference_3_0());
            				
            pushFollow(FOLLOW_31);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getAsercionAccess().getElemento2Keyword_4());
            		
            // InternalMyDsl.g:1120:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1121:4: ( ruleEString )
            {
            // InternalMyDsl.g:1121:4: ( ruleEString )
            // InternalMyDsl.g:1122:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAsercionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAsercionAccess().getElemento2ElementoCrossReference_5_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMyDsl.g:1144:1: entryRuleParametro returns [EObject current=null] : iv_ruleParametro= ruleParametro EOF ;
    public final EObject entryRuleParametro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametro = null;


        try {
            // InternalMyDsl.g:1144:50: (iv_ruleParametro= ruleParametro EOF )
            // InternalMyDsl.g:1145:2: iv_ruleParametro= ruleParametro EOF
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
    // InternalMyDsl.g:1151:1: ruleParametro returns [EObject current=null] : ( () otherlv_1= 'Parametro' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'tipo' ( (lv_tipo_6_0= ruleTipoParametro ) ) )? otherlv_7= '}' ) ;
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
            // InternalMyDsl.g:1157:2: ( ( () otherlv_1= 'Parametro' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'tipo' ( (lv_tipo_6_0= ruleTipoParametro ) ) )? otherlv_7= '}' ) )
            // InternalMyDsl.g:1158:2: ( () otherlv_1= 'Parametro' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'tipo' ( (lv_tipo_6_0= ruleTipoParametro ) ) )? otherlv_7= '}' )
            {
            // InternalMyDsl.g:1158:2: ( () otherlv_1= 'Parametro' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'tipo' ( (lv_tipo_6_0= ruleTipoParametro ) ) )? otherlv_7= '}' )
            // InternalMyDsl.g:1159:3: () otherlv_1= 'Parametro' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'tipo' ( (lv_tipo_6_0= ruleTipoParametro ) ) )? otherlv_7= '}'
            {
            // InternalMyDsl.g:1159:3: ()
            // InternalMyDsl.g:1160:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParametroAccess().getParametroAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getParametroAccess().getParametroKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getParametroAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1174:3: (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==42) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1175:4: otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getParametroAccess().getNombreKeyword_3_0());
                    			
                    // InternalMyDsl.g:1179:4: ( (lv_nombre_4_0= ruleEString ) )
                    // InternalMyDsl.g:1180:5: (lv_nombre_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:1180:5: (lv_nombre_4_0= ruleEString )
                    // InternalMyDsl.g:1181:6: lv_nombre_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParametroAccess().getNombreEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_33);
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

            // InternalMyDsl.g:1199:3: (otherlv_5= 'tipo' ( (lv_tipo_6_0= ruleTipoParametro ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==43) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1200:4: otherlv_5= 'tipo' ( (lv_tipo_6_0= ruleTipoParametro ) )
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_34); 

                    				newLeafNode(otherlv_5, grammarAccess.getParametroAccess().getTipoKeyword_4_0());
                    			
                    // InternalMyDsl.g:1204:4: ( (lv_tipo_6_0= ruleTipoParametro ) )
                    // InternalMyDsl.g:1205:5: (lv_tipo_6_0= ruleTipoParametro )
                    {
                    // InternalMyDsl.g:1205:5: (lv_tipo_6_0= ruleTipoParametro )
                    // InternalMyDsl.g:1206:6: lv_tipo_6_0= ruleTipoParametro
                    {

                    						newCompositeNode(grammarAccess.getParametroAccess().getTipoTipoParametroEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
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

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMyDsl.g:1232:1: ruleTipoAtributo returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) ) ;
    public final Enumerator ruleTipoAtributo() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1238:2: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) ) )
            // InternalMyDsl.g:1239:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) )
            {
            // InternalMyDsl.g:1239:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt19=1;
                }
                break;
            case 45:
                {
                alt19=2;
                }
                break;
            case 46:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1240:3: (enumLiteral_0= 'string' )
                    {
                    // InternalMyDsl.g:1240:3: (enumLiteral_0= 'string' )
                    // InternalMyDsl.g:1241:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getTipoAtributoAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoAtributoAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1248:3: (enumLiteral_1= 'int' )
                    {
                    // InternalMyDsl.g:1248:3: (enumLiteral_1= 'int' )
                    // InternalMyDsl.g:1249:4: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getTipoAtributoAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoAtributoAccess().getIntEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1256:3: (enumLiteral_2= 'boolean' )
                    {
                    // InternalMyDsl.g:1256:3: (enumLiteral_2= 'boolean' )
                    // InternalMyDsl.g:1257:4: enumLiteral_2= 'boolean'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_2); 

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
    // InternalMyDsl.g:1267:1: ruleMockaroo returns [Enumerator current=null] : ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'LastNameType' ) | (enumLiteral_2= 'FamilyNameType' ) | (enumLiteral_3= 'FullNameType' ) | (enumLiteral_4= 'GenderType' ) | (enumLiteral_5= 'EmailAddressType' ) | (enumLiteral_6= 'PhoneType' ) | (enumLiteral_7= 'CountryType' ) | (enumLiteral_8= 'CityType' ) | (enumLiteral_9= 'CountryCodeType' ) | (enumLiteral_10= 'LatitudeType' ) | (enumLiteral_11= 'LongitudType' ) | (enumLiteral_12= 'RowNumberType' ) | (enumLiteral_13= 'BooleanType' ) ) ;
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
            // InternalMyDsl.g:1273:2: ( ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'LastNameType' ) | (enumLiteral_2= 'FamilyNameType' ) | (enumLiteral_3= 'FullNameType' ) | (enumLiteral_4= 'GenderType' ) | (enumLiteral_5= 'EmailAddressType' ) | (enumLiteral_6= 'PhoneType' ) | (enumLiteral_7= 'CountryType' ) | (enumLiteral_8= 'CityType' ) | (enumLiteral_9= 'CountryCodeType' ) | (enumLiteral_10= 'LatitudeType' ) | (enumLiteral_11= 'LongitudType' ) | (enumLiteral_12= 'RowNumberType' ) | (enumLiteral_13= 'BooleanType' ) ) )
            // InternalMyDsl.g:1274:2: ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'LastNameType' ) | (enumLiteral_2= 'FamilyNameType' ) | (enumLiteral_3= 'FullNameType' ) | (enumLiteral_4= 'GenderType' ) | (enumLiteral_5= 'EmailAddressType' ) | (enumLiteral_6= 'PhoneType' ) | (enumLiteral_7= 'CountryType' ) | (enumLiteral_8= 'CityType' ) | (enumLiteral_9= 'CountryCodeType' ) | (enumLiteral_10= 'LatitudeType' ) | (enumLiteral_11= 'LongitudType' ) | (enumLiteral_12= 'RowNumberType' ) | (enumLiteral_13= 'BooleanType' ) )
            {
            // InternalMyDsl.g:1274:2: ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'LastNameType' ) | (enumLiteral_2= 'FamilyNameType' ) | (enumLiteral_3= 'FullNameType' ) | (enumLiteral_4= 'GenderType' ) | (enumLiteral_5= 'EmailAddressType' ) | (enumLiteral_6= 'PhoneType' ) | (enumLiteral_7= 'CountryType' ) | (enumLiteral_8= 'CityType' ) | (enumLiteral_9= 'CountryCodeType' ) | (enumLiteral_10= 'LatitudeType' ) | (enumLiteral_11= 'LongitudType' ) | (enumLiteral_12= 'RowNumberType' ) | (enumLiteral_13= 'BooleanType' ) )
            int alt20=14;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt20=1;
                }
                break;
            case 48:
                {
                alt20=2;
                }
                break;
            case 49:
                {
                alt20=3;
                }
                break;
            case 50:
                {
                alt20=4;
                }
                break;
            case 51:
                {
                alt20=5;
                }
                break;
            case 52:
                {
                alt20=6;
                }
                break;
            case 53:
                {
                alt20=7;
                }
                break;
            case 54:
                {
                alt20=8;
                }
                break;
            case 55:
                {
                alt20=9;
                }
                break;
            case 56:
                {
                alt20=10;
                }
                break;
            case 57:
                {
                alt20=11;
                }
                break;
            case 58:
                {
                alt20=12;
                }
                break;
            case 59:
                {
                alt20=13;
                }
                break;
            case 60:
                {
                alt20=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1275:3: (enumLiteral_0= 'FirstNameType' )
                    {
                    // InternalMyDsl.g:1275:3: (enumLiteral_0= 'FirstNameType' )
                    // InternalMyDsl.g:1276:4: enumLiteral_0= 'FirstNameType'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getFirstNameTypeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMockarooAccess().getFirstNameTypeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1283:3: (enumLiteral_1= 'LastNameType' )
                    {
                    // InternalMyDsl.g:1283:3: (enumLiteral_1= 'LastNameType' )
                    // InternalMyDsl.g:1284:4: enumLiteral_1= 'LastNameType'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getLastNameTypeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMockarooAccess().getLastNameTypeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1291:3: (enumLiteral_2= 'FamilyNameType' )
                    {
                    // InternalMyDsl.g:1291:3: (enumLiteral_2= 'FamilyNameType' )
                    // InternalMyDsl.g:1292:4: enumLiteral_2= 'FamilyNameType'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getFamilyNameTypeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMockarooAccess().getFamilyNameTypeEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1299:3: (enumLiteral_3= 'FullNameType' )
                    {
                    // InternalMyDsl.g:1299:3: (enumLiteral_3= 'FullNameType' )
                    // InternalMyDsl.g:1300:4: enumLiteral_3= 'FullNameType'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getFullNameTypeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMockarooAccess().getFullNameTypeEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1307:3: (enumLiteral_4= 'GenderType' )
                    {
                    // InternalMyDsl.g:1307:3: (enumLiteral_4= 'GenderType' )
                    // InternalMyDsl.g:1308:4: enumLiteral_4= 'GenderType'
                    {
                    enumLiteral_4=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getGenderTypeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMockarooAccess().getGenderTypeEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1315:3: (enumLiteral_5= 'EmailAddressType' )
                    {
                    // InternalMyDsl.g:1315:3: (enumLiteral_5= 'EmailAddressType' )
                    // InternalMyDsl.g:1316:4: enumLiteral_5= 'EmailAddressType'
                    {
                    enumLiteral_5=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getEmailAddressTypeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getMockarooAccess().getEmailAddressTypeEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1323:3: (enumLiteral_6= 'PhoneType' )
                    {
                    // InternalMyDsl.g:1323:3: (enumLiteral_6= 'PhoneType' )
                    // InternalMyDsl.g:1324:4: enumLiteral_6= 'PhoneType'
                    {
                    enumLiteral_6=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getPhoneTypeEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getMockarooAccess().getPhoneTypeEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1331:3: (enumLiteral_7= 'CountryType' )
                    {
                    // InternalMyDsl.g:1331:3: (enumLiteral_7= 'CountryType' )
                    // InternalMyDsl.g:1332:4: enumLiteral_7= 'CountryType'
                    {
                    enumLiteral_7=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getCountryTypeEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getMockarooAccess().getCountryTypeEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:1339:3: (enumLiteral_8= 'CityType' )
                    {
                    // InternalMyDsl.g:1339:3: (enumLiteral_8= 'CityType' )
                    // InternalMyDsl.g:1340:4: enumLiteral_8= 'CityType'
                    {
                    enumLiteral_8=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getCityTypeEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getMockarooAccess().getCityTypeEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:1347:3: (enumLiteral_9= 'CountryCodeType' )
                    {
                    // InternalMyDsl.g:1347:3: (enumLiteral_9= 'CountryCodeType' )
                    // InternalMyDsl.g:1348:4: enumLiteral_9= 'CountryCodeType'
                    {
                    enumLiteral_9=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getCountryCodeTypeEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getMockarooAccess().getCountryCodeTypeEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:1355:3: (enumLiteral_10= 'LatitudeType' )
                    {
                    // InternalMyDsl.g:1355:3: (enumLiteral_10= 'LatitudeType' )
                    // InternalMyDsl.g:1356:4: enumLiteral_10= 'LatitudeType'
                    {
                    enumLiteral_10=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getLatitudeTypeEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getMockarooAccess().getLatitudeTypeEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:1363:3: (enumLiteral_11= 'LongitudType' )
                    {
                    // InternalMyDsl.g:1363:3: (enumLiteral_11= 'LongitudType' )
                    // InternalMyDsl.g:1364:4: enumLiteral_11= 'LongitudType'
                    {
                    enumLiteral_11=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getLongitudTypeEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getMockarooAccess().getLongitudTypeEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:1371:3: (enumLiteral_12= 'RowNumberType' )
                    {
                    // InternalMyDsl.g:1371:3: (enumLiteral_12= 'RowNumberType' )
                    // InternalMyDsl.g:1372:4: enumLiteral_12= 'RowNumberType'
                    {
                    enumLiteral_12=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getRowNumberTypeEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getMockarooAccess().getRowNumberTypeEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:1379:3: (enumLiteral_13= 'BooleanType' )
                    {
                    // InternalMyDsl.g:1379:3: (enumLiteral_13= 'BooleanType' )
                    // InternalMyDsl.g:1380:4: enumLiteral_13= 'BooleanType'
                    {
                    enumLiteral_13=(Token)match(input,60,FOLLOW_2); 

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
    // InternalMyDsl.g:1390:1: ruleTipoMetodoRest returns [Enumerator current=null] : ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) ;
    public final Enumerator ruleTipoMetodoRest() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1396:2: ( ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) )
            // InternalMyDsl.g:1397:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            {
            // InternalMyDsl.g:1397:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt21=1;
                }
                break;
            case 62:
                {
                alt21=2;
                }
                break;
            case 63:
                {
                alt21=3;
                }
                break;
            case 64:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1398:3: (enumLiteral_0= 'GET' )
                    {
                    // InternalMyDsl.g:1398:3: (enumLiteral_0= 'GET' )
                    // InternalMyDsl.g:1399:4: enumLiteral_0= 'GET'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getTipoMetodoRestAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoMetodoRestAccess().getGETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1406:3: (enumLiteral_1= 'POST' )
                    {
                    // InternalMyDsl.g:1406:3: (enumLiteral_1= 'POST' )
                    // InternalMyDsl.g:1407:4: enumLiteral_1= 'POST'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getTipoMetodoRestAccess().getPOSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoMetodoRestAccess().getPOSTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1414:3: (enumLiteral_2= 'PUT' )
                    {
                    // InternalMyDsl.g:1414:3: (enumLiteral_2= 'PUT' )
                    // InternalMyDsl.g:1415:4: enumLiteral_2= 'PUT'
                    {
                    enumLiteral_2=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getTipoMetodoRestAccess().getPUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTipoMetodoRestAccess().getPUTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1422:3: (enumLiteral_3= 'DELETE' )
                    {
                    // InternalMyDsl.g:1422:3: (enumLiteral_3= 'DELETE' )
                    // InternalMyDsl.g:1423:4: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,64,FOLLOW_2); 

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
    // InternalMyDsl.g:1433:1: ruleTipoParametro returns [Enumerator current=null] : ( (enumLiteral_0= 'Path' ) | (enumLiteral_1= 'Query' ) | (enumLiteral_2= 'Body' ) ) ;
    public final Enumerator ruleTipoParametro() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1439:2: ( ( (enumLiteral_0= 'Path' ) | (enumLiteral_1= 'Query' ) | (enumLiteral_2= 'Body' ) ) )
            // InternalMyDsl.g:1440:2: ( (enumLiteral_0= 'Path' ) | (enumLiteral_1= 'Query' ) | (enumLiteral_2= 'Body' ) )
            {
            // InternalMyDsl.g:1440:2: ( (enumLiteral_0= 'Path' ) | (enumLiteral_1= 'Query' ) | (enumLiteral_2= 'Body' ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt22=1;
                }
                break;
            case 66:
                {
                alt22=2;
                }
                break;
            case 67:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1441:3: (enumLiteral_0= 'Path' )
                    {
                    // InternalMyDsl.g:1441:3: (enumLiteral_0= 'Path' )
                    // InternalMyDsl.g:1442:4: enumLiteral_0= 'Path'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getTipoParametroAccess().getPathEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoParametroAccess().getPathEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1449:3: (enumLiteral_1= 'Query' )
                    {
                    // InternalMyDsl.g:1449:3: (enumLiteral_1= 'Query' )
                    // InternalMyDsl.g:1450:4: enumLiteral_1= 'Query'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getTipoParametroAccess().getQueryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoParametroAccess().getQueryEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1457:3: (enumLiteral_2= 'Body' )
                    {
                    // InternalMyDsl.g:1457:3: (enumLiteral_2= 'Body' )
                    // InternalMyDsl.g:1458:4: enumLiteral_2= 'Body'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_2); 

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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000900002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x1FFF800000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000700000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000030000100L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000100L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000C0000400000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000400000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});

}