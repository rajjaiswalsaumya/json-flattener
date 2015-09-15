package models;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@JsonInclude(JsonInclude.Include.ALWAYS)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "trends",
        "symbols",
        "urls",
        "hashtags",
        "user_mentions"
})
class Entities {

    @JsonProperty("trends")
    private List<Object> trends = new ArrayList<Object>();
    @JsonProperty("symbols")
    private List<Object> symbols = new ArrayList<Object>();
    @JsonProperty("urls")
    private List<Object> urls = new ArrayList<Object>();
    @JsonProperty("hashtags")
    private List<Hashtag> hashtags = new ArrayList<Hashtag>();
    @JsonProperty("user_mentions")
    private List<Object> user_mentions = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The trends
     */
    @JsonProperty("trends")
    public List<Object> getTrends() {
        return trends;
    }

    /**
     * @param trends The trends
     */
    @JsonProperty("trends")
    public void setTrends(List<Object> trends) {
        this.trends = trends;
    }

    /**
     * @return The symbols
     */
    @JsonProperty("symbols")
    public List<Object> getSymbols() {
        return symbols;
    }

    /**
     * @param symbols The symbols
     */
    @JsonProperty("symbols")
    public void setSymbols(List<Object> symbols) {
        this.symbols = symbols;
    }

    /**
     * @return The urls
     */
    @JsonProperty("urls")
    public List<Object> getUrls() {
        return urls;
    }

    /**
     * @param urls The urls
     */
    @JsonProperty("urls")
    public void setUrls(List<Object> urls) {
        this.urls = urls;
    }

    /**
     * @return The hashtags
     */
    @JsonProperty("hashtags")
    public List<Hashtag> getHashtags() {
        return hashtags;
    }

    /**
     * @param hashtags The hashtags
     */
    @JsonProperty("hashtags")
    public void setHashtags(List<Hashtag> hashtags) {
        this.hashtags = hashtags;
    }

    /**
     * @return The user_mentions
     */
    @JsonProperty("user_mentions")
    public List<Object> getUser_mentions() {
        return user_mentions;
    }

    /**
     * @param user_mentions The user_mentions
     */
    @JsonProperty("user_mentions")
    public void setUser_mentions(List<Object> user_mentions) {
        this.user_mentions = user_mentions;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);

    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(trends).append(symbols).append(urls).append(hashtags).append(user_mentions).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Entities) == false) {
            return false;
        }
        Entities rhs = ((Entities) other);
        return new EqualsBuilder().append(trends, rhs.trends).append(symbols, rhs.symbols).append(urls, rhs.urls).append(hashtags, rhs.hashtags).append(user_mentions, rhs.user_mentions).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
//-----------------------------------models.Hashtag.java-----------------------------------


@JsonInclude(JsonInclude.Include.ALWAYS)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "text",
        "indices"
})
class Hashtag {

    @JsonProperty("text")
    private String text;
    @JsonProperty("indices")
    private List<Long> indices = new ArrayList<Long>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * @param text The text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return The indices
     */
    @JsonProperty("indices")
    public List<Long> getIndices() {
        return indices;
    }

    /**
     * @param indices The indices
     */
    @JsonProperty("indices")
    public void setIndices(List<Long> indices) {
        this.indices = indices;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);

    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(text).append(indices).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Hashtag) == false) {
            return false;
        }
        Hashtag rhs = ((Hashtag) other);
        return new EqualsBuilder().append(text, rhs.text).append(indices, rhs.indices).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
//-----------------------------------models.JsonModel.java-----------------------------------


@JsonInclude(JsonInclude.Include.ALWAYS)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "filter_level",
        "retweeted",
        "in_reply_to_screen_name",
        "possibly_sensitive",
        "truncated",
        "lang",
        "in_reply_to_status_id_str",
        "id",
        "in_reply_to_user_id_str",
        "timestamp_ms",
        "in_reply_to_status_id",
        "created_at",
        "favorite_count",
        "place",
        "coordinates",
        "text",
        "contributors",
        "geo",
        "entities",
        "source",
        "favorited",
        "in_reply_to_user_id",
        "retweet_count",
        "id_str",
        "user"
})
public class JsonModel {

    @JsonProperty("filter_level")
    private String filter_level;
    @JsonProperty("retweeted")
    private Boolean retweeted;
    @JsonProperty("in_reply_to_screen_name")
    private Object in_reply_to_screen_name;
    @JsonProperty("possibly_sensitive")
    private Boolean possibly_sensitive;
    @JsonProperty("truncated")
    private Boolean truncated;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("in_reply_to_status_id_str")
    private Object in_reply_to_status_id_str;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("in_reply_to_user_id_str")
    private Object in_reply_to_user_id_str;
    @JsonProperty("timestamp_ms")
    private String timestamp_ms;
    @JsonProperty("in_reply_to_status_id")
    private Object in_reply_to_status_id;
    @JsonProperty("created_at")
    private String created_at;
    @JsonProperty("favorite_count")
    private Long favorite_count;
    @JsonProperty("place")
    private Object place;
    @JsonProperty("coordinates")
    private Object coordinates;
    @JsonProperty("text")
    private String text;
    @JsonProperty("contributors")
    private Object contributors;
    @JsonProperty("geo")
    private Object geo;
    @JsonProperty("entities")
    private Entities entities;
    @JsonProperty("source")
    private String source;
    @JsonProperty("favorited")
    private Boolean favorited;
    @JsonProperty("in_reply_to_user_id")
    private Object in_reply_to_user_id;
    @JsonProperty("retweet_count")
    private Long retweet_count;
    @JsonProperty("id_str")
    private String id_str;
    @JsonProperty("user")
    private User user;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The filter_level
     */
    @JsonProperty("filter_level")
    public String getFilter_level() {
        return filter_level;
    }

    /**
     * @param filter_level The filter_level
     */
    @JsonProperty("filter_level")
    public void setFilter_level(String filter_level) {
        this.filter_level = filter_level;
    }

    /**
     * @return The retweeted
     */
    @JsonProperty("retweeted")
    public Boolean getRetweeted() {
        return retweeted;
    }

    /**
     * @param retweeted The retweeted
     */
    @JsonProperty("retweeted")
    public void setRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
    }

    /**
     * @return The in_reply_to_screen_name
     */
    @JsonProperty("in_reply_to_screen_name")
    public Object getIn_reply_to_screen_name() {
        return in_reply_to_screen_name;
    }

    /**
     * @param in_reply_to_screen_name The in_reply_to_screen_name
     */
    @JsonProperty("in_reply_to_screen_name")
    public void setIn_reply_to_screen_name(Object in_reply_to_screen_name) {
        this.in_reply_to_screen_name = in_reply_to_screen_name;
    }

    /**
     * @return The possibly_sensitive
     */
    @JsonProperty("possibly_sensitive")
    public Boolean getPossibly_sensitive() {
        return possibly_sensitive;
    }

    /**
     * @param possibly_sensitive The possibly_sensitive
     */
    @JsonProperty("possibly_sensitive")
    public void setPossibly_sensitive(Boolean possibly_sensitive) {
        this.possibly_sensitive = possibly_sensitive;
    }

    /**
     * @return The truncated
     */
    @JsonProperty("truncated")
    public Boolean getTruncated() {
        return truncated;
    }

    /**
     * @param truncated The truncated
     */
    @JsonProperty("truncated")
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    /**
     * @return The lang
     */
    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    /**
     * @param lang The lang
     */
    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * @return The in_reply_to_status_id_str
     */
    @JsonProperty("in_reply_to_status_id_str")
    public Object getIn_reply_to_status_id_str() {
        return in_reply_to_status_id_str;
    }

    /**
     * @param in_reply_to_status_id_str The in_reply_to_status_id_str
     */
    @JsonProperty("in_reply_to_status_id_str")
    public void setIn_reply_to_status_id_str(Object in_reply_to_status_id_str) {
        this.in_reply_to_status_id_str = in_reply_to_status_id_str;
    }

    /**
     * @return The id
     */
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    /**
     * @param id The id
     */
    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return The in_reply_to_user_id_str
     */
    @JsonProperty("in_reply_to_user_id_str")
    public Object getIn_reply_to_user_id_str() {
        return in_reply_to_user_id_str;
    }

    /**
     * @param in_reply_to_user_id_str The in_reply_to_user_id_str
     */
    @JsonProperty("in_reply_to_user_id_str")
    public void setIn_reply_to_user_id_str(Object in_reply_to_user_id_str) {
        this.in_reply_to_user_id_str = in_reply_to_user_id_str;
    }

    /**
     * @return The timestamp_ms
     */
    @JsonProperty("timestamp_ms")
    public String getTimestamp_ms() {
        return timestamp_ms;
    }

    /**
     * @param timestamp_ms The timestamp_ms
     */
    @JsonProperty("timestamp_ms")
    public void setTimestamp_ms(String timestamp_ms) {
        this.timestamp_ms = timestamp_ms;
    }

    /**
     * @return The in_reply_to_status_id
     */
    @JsonProperty("in_reply_to_status_id")
    public Object getIn_reply_to_status_id() {
        return in_reply_to_status_id;
    }

    /**
     * @param in_reply_to_status_id The in_reply_to_status_id
     */
    @JsonProperty("in_reply_to_status_id")
    public void setIn_reply_to_status_id(Object in_reply_to_status_id) {
        this.in_reply_to_status_id = in_reply_to_status_id;
    }

    /**
     * @return The created_at
     */
    @JsonProperty("created_at")
    public String getCreated_at() {
        return created_at;
    }

    /**
     * @param created_at The created_at
     */
    @JsonProperty("created_at")
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    /**
     * @return The favorite_count
     */
    @JsonProperty("favorite_count")
    public Long getFavorite_count() {
        return favorite_count;
    }

    /**
     * @param favorite_count The favorite_count
     */
    @JsonProperty("favorite_count")
    public void setFavorite_count(Long favorite_count) {
        this.favorite_count = favorite_count;
    }

    /**
     * @return The place
     */
    @JsonProperty("place")
    public Object getPlace() {
        return place;
    }

    /**
     * @param place The place
     */
    @JsonProperty("place")
    public void setPlace(Object place) {
        this.place = place;
    }

    /**
     * @return The coordinates
     */
    @JsonProperty("coordinates")
    public Object getCoordinates() {
        return coordinates;
    }

    /**
     * @param coordinates The coordinates
     */
    @JsonProperty("coordinates")
    public void setCoordinates(Object coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * @return The text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * @param text The text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return The contributors
     */
    @JsonProperty("contributors")
    public Object getContributors() {
        return contributors;
    }

    /**
     * @param contributors The contributors
     */
    @JsonProperty("contributors")
    public void setContributors(Object contributors) {
        this.contributors = contributors;
    }

    /**
     * @return The geo
     */
    @JsonProperty("geo")
    public Object getGeo() {
        return geo;
    }

    /**
     * @param geo The geo
     */
    @JsonProperty("geo")
    public void setGeo(Object geo) {
        this.geo = geo;
    }

    /**
     * @return The entities
     */
    @JsonProperty("entities")
    public Entities getEntities() {
        return entities;
    }

    /**
     * @param entities The entities
     */
    @JsonProperty("entities")
    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    /**
     * @return The source
     */
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    /**
     * @param source The source
     */
    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return The favorited
     */
    @JsonProperty("favorited")
    public Boolean getFavorited() {
        return favorited;
    }

    /**
     * @param favorited The favorited
     */
    @JsonProperty("favorited")
    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    /**
     * @return The in_reply_to_user_id
     */
    @JsonProperty("in_reply_to_user_id")
    public Object getIn_reply_to_user_id() {
        return in_reply_to_user_id;
    }

    /**
     * @param in_reply_to_user_id The in_reply_to_user_id
     */
    @JsonProperty("in_reply_to_user_id")
    public void setIn_reply_to_user_id(Object in_reply_to_user_id) {
        this.in_reply_to_user_id = in_reply_to_user_id;
    }

    /**
     * @return The retweet_count
     */
    @JsonProperty("retweet_count")
    public Long getRetweet_count() {
        return retweet_count;
    }

    /**
     * @param retweet_count The retweet_count
     */
    @JsonProperty("retweet_count")
    public void setRetweet_count(Long retweet_count) {
        this.retweet_count = retweet_count;
    }

    /**
     * @return The id_str
     */
    @JsonProperty("id_str")
    public String getId_str() {
        return id_str;
    }

    /**
     * @param id_str The id_str
     */
    @JsonProperty("id_str")
    public void setId_str(String id_str) {
        this.id_str = id_str;
    }

    /**
     * @return The user
     */
    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    /**
     * @param user The user
     */
    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(filter_level).append(retweeted).append(in_reply_to_screen_name).append(possibly_sensitive).append(truncated).append(lang).append(in_reply_to_status_id_str).append(id).append(in_reply_to_user_id_str).append(timestamp_ms).append(in_reply_to_status_id).append(created_at).append(favorite_count).append(place).append(coordinates).append(text).append(contributors).append(geo).append(entities).append(source).append(favorited).append(in_reply_to_user_id).append(retweet_count).append(id_str).append(user).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JsonModel) == false) {
            return false;
        }
        JsonModel rhs = ((JsonModel) other);
        return new EqualsBuilder().append(filter_level, rhs.filter_level).append(retweeted, rhs.retweeted).append(in_reply_to_screen_name, rhs.in_reply_to_screen_name).append(possibly_sensitive, rhs.possibly_sensitive).append(truncated, rhs.truncated).append(lang, rhs.lang).append(in_reply_to_status_id_str, rhs.in_reply_to_status_id_str).append(id, rhs.id).append(in_reply_to_user_id_str, rhs.in_reply_to_user_id_str).append(timestamp_ms, rhs.timestamp_ms).append(in_reply_to_status_id, rhs.in_reply_to_status_id).append(created_at, rhs.created_at).append(favorite_count, rhs.favorite_count).append(place, rhs.place).append(coordinates, rhs.coordinates).append(text, rhs.text).append(contributors, rhs.contributors).append(geo, rhs.geo).append(entities, rhs.entities).append(source, rhs.source).append(favorited, rhs.favorited).append(in_reply_to_user_id, rhs.in_reply_to_user_id).append(retweet_count, rhs.retweet_count).append(id_str, rhs.id_str).append(user, rhs.user).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
//-----------------------------------models.User.java-----------------------------------


@JsonInclude(JsonInclude.Include.ALWAYS)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "location",
        "default_profile",
        "statuses_count",
        "profile_background_tile",
        "lang",
        "profile_link_color",
        "profile_banner_url",
        "id",
        "following",
        "favourites_count",
        "protected",
        "profile_text_color",
        "verified",
        "description",
        "contributors_enabled",
        "profile_sidebar_border_color",
        "name",
        "profile_background_color",
        "created_at",
        "default_profile_image",
        "followers_count",
        "profile_image_url_https",
        "geo_enabled",
        "profile_background_image_url",
        "profile_background_image_url_https",
        "follow_request_sent",
        "url",
        "utc_offset",
        "time_zone",
        "notifications",
        "profile_use_background_image",
        "friends_count",
        "profile_sidebar_fill_color",
        "screen_name",
        "id_str",
        "profile_image_url",
        "listed_count",
        "is_translator"
})
class User {

    @JsonProperty("location")
    private String location;
    @JsonProperty("default_profile")
    private Boolean default_profile;
    @JsonProperty("statuses_count")
    private Long statuses_count;
    @JsonProperty("profile_background_tile")
    private Boolean profile_background_tile;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("profile_link_color")
    private String profile_link_color;
    @JsonProperty("profile_banner_url")
    private String profile_banner_url;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("following")
    private Object following;
    @JsonProperty("favourites_count")
    private Long favourites_count;
    @JsonProperty("protected")
    private Boolean _protected;
    @JsonProperty("profile_text_color")
    private String profile_text_color;
    @JsonProperty("verified")
    private Boolean verified;
    @JsonProperty("description")
    private String description;
    @JsonProperty("contributors_enabled")
    private Boolean contributors_enabled;
    @JsonProperty("profile_sidebar_border_color")
    private String profile_sidebar_border_color;
    @JsonProperty("name")
    private String name;
    @JsonProperty("profile_background_color")
    private String profile_background_color;
    @JsonProperty("created_at")
    private String created_at;
    @JsonProperty("default_profile_image")
    private Boolean default_profile_image;
    @JsonProperty("followers_count")
    private Long followers_count;
    @JsonProperty("profile_image_url_https")
    private String profile_image_url_https;
    @JsonProperty("geo_enabled")
    private Boolean geo_enabled;
    @JsonProperty("profile_background_image_url")
    private String profile_background_image_url;
    @JsonProperty("profile_background_image_url_https")
    private String profile_background_image_url_https;
    @JsonProperty("follow_request_sent")
    private Object follow_request_sent;
    @JsonProperty("url")
    private Object url;
    @JsonProperty("utc_offset")
    private Long utc_offset;
    @JsonProperty("time_zone")
    private String time_zone;
    @JsonProperty("notifications")
    private Object notifications;
    @JsonProperty("profile_use_background_image")
    private Boolean profile_use_background_image;
    @JsonProperty("friends_count")
    private Long friends_count;
    @JsonProperty("profile_sidebar_fill_color")
    private String profile_sidebar_fill_color;
    @JsonProperty("screen_name")
    private String screen_name;
    @JsonProperty("id_str")
    private String id_str;
    @JsonProperty("profile_image_url")
    private String profile_image_url;
    @JsonProperty("listed_count")
    private Long listed_count;
    @JsonProperty("is_translator")
    private Boolean is_translator;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The location
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * @param location The location
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return The default_profile
     */
    @JsonProperty("default_profile")
    public Boolean getDefault_profile() {
        return default_profile;
    }

    /**
     * @param default_profile The default_profile
     */
    @JsonProperty("default_profile")
    public void setDefault_profile(Boolean default_profile) {
        this.default_profile = default_profile;
    }

    /**
     * @return The statuses_count
     */
    @JsonProperty("statuses_count")
    public Long getStatuses_count() {
        return statuses_count;
    }

    /**
     * @param statuses_count The statuses_count
     */
    @JsonProperty("statuses_count")
    public void setStatuses_count(Long statuses_count) {
        this.statuses_count = statuses_count;
    }

    /**
     * @return The profile_background_tile
     */
    @JsonProperty("profile_background_tile")
    public Boolean getProfile_background_tile() {
        return profile_background_tile;
    }

    /**
     * @param profile_background_tile The profile_background_tile
     */
    @JsonProperty("profile_background_tile")
    public void setProfile_background_tile(Boolean profile_background_tile) {
        this.profile_background_tile = profile_background_tile;
    }

    /**
     * @return The lang
     */
    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    /**
     * @param lang The lang
     */
    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * @return The profile_link_color
     */
    @JsonProperty("profile_link_color")
    public String getProfile_link_color() {
        return profile_link_color;
    }

    /**
     * @param profile_link_color The profile_link_color
     */
    @JsonProperty("profile_link_color")
    public void setProfile_link_color(String profile_link_color) {
        this.profile_link_color = profile_link_color;
    }

    /**
     * @return The profile_banner_url
     */
    @JsonProperty("profile_banner_url")
    public String getProfile_banner_url() {
        return profile_banner_url;
    }

    /**
     * @param profile_banner_url The profile_banner_url
     */
    @JsonProperty("profile_banner_url")
    public void setProfile_banner_url(String profile_banner_url) {
        this.profile_banner_url = profile_banner_url;
    }

    /**
     * @return The id
     */
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    /**
     * @param id The id
     */
    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return The following
     */
    @JsonProperty("following")
    public Object getFollowing() {
        return following;
    }

    /**
     * @param following The following
     */
    @JsonProperty("following")
    public void setFollowing(Object following) {
        this.following = following;
    }

    /**
     * @return The favourites_count
     */
    @JsonProperty("favourites_count")
    public Long getFavourites_count() {
        return favourites_count;
    }

    /**
     * @param favourites_count The favourites_count
     */
    @JsonProperty("favourites_count")
    public void setFavourites_count(Long favourites_count) {
        this.favourites_count = favourites_count;
    }

    /**
     * @return The _protected
     */
    @JsonProperty("protected")
    public Boolean getProtected() {
        return _protected;
    }

    /**
     * @param _protected The protected
     */
    @JsonProperty("protected")
    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    /**
     * @return The profile_text_color
     */
    @JsonProperty("profile_text_color")
    public String getProfile_text_color() {
        return profile_text_color;
    }

    /**
     * @param profile_text_color The profile_text_color
     */
    @JsonProperty("profile_text_color")
    public void setProfile_text_color(String profile_text_color) {
        this.profile_text_color = profile_text_color;
    }

    /**
     * @return The verified
     */
    @JsonProperty("verified")
    public Boolean getVerified() {
        return verified;
    }

    /**
     * @param verified The verified
     */
    @JsonProperty("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    /**
     * @return The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return The contributors_enabled
     */
    @JsonProperty("contributors_enabled")
    public Boolean getContributors_enabled() {
        return contributors_enabled;
    }

    /**
     * @param contributors_enabled The contributors_enabled
     */
    @JsonProperty("contributors_enabled")
    public void setContributors_enabled(Boolean contributors_enabled) {
        this.contributors_enabled = contributors_enabled;
    }

    /**
     * @return The profile_sidebar_border_color
     */
    @JsonProperty("profile_sidebar_border_color")
    public String getProfile_sidebar_border_color() {
        return profile_sidebar_border_color;
    }

    /**
     * @param profile_sidebar_border_color The profile_sidebar_border_color
     */
    @JsonProperty("profile_sidebar_border_color")
    public void setProfile_sidebar_border_color(String profile_sidebar_border_color) {
        this.profile_sidebar_border_color = profile_sidebar_border_color;
    }

    /**
     * @return The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The profile_background_color
     */
    @JsonProperty("profile_background_color")
    public String getProfile_background_color() {
        return profile_background_color;
    }

    /**
     * @param profile_background_color The profile_background_color
     */
    @JsonProperty("profile_background_color")
    public void setProfile_background_color(String profile_background_color) {
        this.profile_background_color = profile_background_color;
    }

    /**
     * @return The created_at
     */
    @JsonProperty("created_at")
    public String getCreated_at() {
        return created_at;
    }

    /**
     * @param created_at The created_at
     */
    @JsonProperty("created_at")
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    /**
     * @return The default_profile_image
     */
    @JsonProperty("default_profile_image")
    public Boolean getDefault_profile_image() {
        return default_profile_image;
    }

    /**
     * @param default_profile_image The default_profile_image
     */
    @JsonProperty("default_profile_image")
    public void setDefault_profile_image(Boolean default_profile_image) {
        this.default_profile_image = default_profile_image;
    }

    /**
     * @return The followers_count
     */
    @JsonProperty("followers_count")
    public Long getFollowers_count() {
        return followers_count;
    }

    /**
     * @param followers_count The followers_count
     */
    @JsonProperty("followers_count")
    public void setFollowers_count(Long followers_count) {
        this.followers_count = followers_count;
    }

    /**
     * @return The profile_image_url_https
     */
    @JsonProperty("profile_image_url_https")
    public String getProfile_image_url_https() {
        return profile_image_url_https;
    }

    /**
     * @param profile_image_url_https The profile_image_url_https
     */
    @JsonProperty("profile_image_url_https")
    public void setProfile_image_url_https(String profile_image_url_https) {
        this.profile_image_url_https = profile_image_url_https;
    }

    /**
     * @return The geo_enabled
     */
    @JsonProperty("geo_enabled")
    public Boolean getGeo_enabled() {
        return geo_enabled;
    }

    /**
     * @param geo_enabled The geo_enabled
     */
    @JsonProperty("geo_enabled")
    public void setGeo_enabled(Boolean geo_enabled) {
        this.geo_enabled = geo_enabled;
    }

    /**
     * @return The profile_background_image_url
     */
    @JsonProperty("profile_background_image_url")
    public String getProfile_background_image_url() {
        return profile_background_image_url;
    }

    /**
     * @param profile_background_image_url The profile_background_image_url
     */
    @JsonProperty("profile_background_image_url")
    public void setProfile_background_image_url(String profile_background_image_url) {
        this.profile_background_image_url = profile_background_image_url;
    }

    /**
     * @return The profile_background_image_url_https
     */
    @JsonProperty("profile_background_image_url_https")
    public String getProfile_background_image_url_https() {
        return profile_background_image_url_https;
    }

    /**
     * @param profile_background_image_url_https The profile_background_image_url_https
     */
    @JsonProperty("profile_background_image_url_https")
    public void setProfile_background_image_url_https(String profile_background_image_url_https) {
        this.profile_background_image_url_https = profile_background_image_url_https;
    }

    /**
     * @return The follow_request_sent
     */
    @JsonProperty("follow_request_sent")
    public Object getFollow_request_sent() {
        return follow_request_sent;
    }

    /**
     * @param follow_request_sent The follow_request_sent
     */
    @JsonProperty("follow_request_sent")
    public void setFollow_request_sent(Object follow_request_sent) {
        this.follow_request_sent = follow_request_sent;
    }

    /**
     * @return The url
     */
    @JsonProperty("url")
    public Object getUrl() {
        return url;
    }

    /**
     * @param url The url
     */
    @JsonProperty("url")
    public void setUrl(Object url) {
        this.url = url;
    }

    /**
     * @return The utc_offset
     */
    @JsonProperty("utc_offset")
    public Long getUtc_offset() {
        return utc_offset;
    }

    /**
     * @param utc_offset The utc_offset
     */
    @JsonProperty("utc_offset")
    public void setUtc_offset(Long utc_offset) {
        this.utc_offset = utc_offset;
    }

    /**
     * @return The time_zone
     */
    @JsonProperty("time_zone")
    public String getTime_zone() {
        return time_zone;
    }

    /**
     * @param time_zone The time_zone
     */
    @JsonProperty("time_zone")
    public void setTime_zone(String time_zone) {
        this.time_zone = time_zone;
    }

    /**
     * @return The notifications
     */
    @JsonProperty("notifications")
    public Object getNotifications() {
        return notifications;
    }

    /**
     * @param notifications The notifications
     */
    @JsonProperty("notifications")
    public void setNotifications(Object notifications) {
        this.notifications = notifications;
    }

    /**
     * @return The profile_use_background_image
     */
    @JsonProperty("profile_use_background_image")
    public Boolean getProfile_use_background_image() {
        return profile_use_background_image;
    }

    /**
     * @param profile_use_background_image The profile_use_background_image
     */
    @JsonProperty("profile_use_background_image")
    public void setProfile_use_background_image(Boolean profile_use_background_image) {
        this.profile_use_background_image = profile_use_background_image;
    }

    /**
     * @return The friends_count
     */
    @JsonProperty("friends_count")
    public Long getFriends_count() {
        return friends_count;
    }

    /**
     * @param friends_count The friends_count
     */
    @JsonProperty("friends_count")
    public void setFriends_count(Long friends_count) {
        this.friends_count = friends_count;
    }

    /**
     * @return The profile_sidebar_fill_color
     */
    @JsonProperty("profile_sidebar_fill_color")
    public String getProfile_sidebar_fill_color() {
        return profile_sidebar_fill_color;
    }

    /**
     * @param profile_sidebar_fill_color The profile_sidebar_fill_color
     */
    @JsonProperty("profile_sidebar_fill_color")
    public void setProfile_sidebar_fill_color(String profile_sidebar_fill_color) {
        this.profile_sidebar_fill_color = profile_sidebar_fill_color;
    }

    /**
     * @return The screen_name
     */
    @JsonProperty("screen_name")
    public String getScreen_name() {
        return screen_name;
    }

    /**
     * @param screen_name The screen_name
     */
    @JsonProperty("screen_name")
    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    /**
     * @return The id_str
     */
    @JsonProperty("id_str")
    public String getId_str() {
        return id_str;
    }

    /**
     * @param id_str The id_str
     */
    @JsonProperty("id_str")
    public void setId_str(String id_str) {
        this.id_str = id_str;
    }

    /**
     * @return The profile_image_url
     */
    @JsonProperty("profile_image_url")
    public String getProfile_image_url() {
        return profile_image_url;
    }

    /**
     * @param profile_image_url The profile_image_url
     */
    @JsonProperty("profile_image_url")
    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }

    /**
     * @return The listed_count
     */
    @JsonProperty("listed_count")
    public Long getListed_count() {
        return listed_count;
    }

    /**
     * @param listed_count The listed_count
     */
    @JsonProperty("listed_count")
    public void setListed_count(Long listed_count) {
        this.listed_count = listed_count;
    }

    /**
     * @return The is_translator
     */
    @JsonProperty("is_translator")
    public Boolean getIs_translator() {
        return is_translator;
    }

    /**
     * @param is_translator The is_translator
     */
    @JsonProperty("is_translator")
    public void setIs_translator(Boolean is_translator) {
        this.is_translator = is_translator;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(location).append(default_profile).append(statuses_count).append(profile_background_tile).append(lang).append(profile_link_color).append(profile_banner_url).append(id).append(following).append(favourites_count).append(_protected).append(profile_text_color).append(verified).append(description).append(contributors_enabled).append(profile_sidebar_border_color).append(name).append(profile_background_color).append(created_at).append(default_profile_image).append(followers_count).append(profile_image_url_https).append(geo_enabled).append(profile_background_image_url).append(profile_background_image_url_https).append(follow_request_sent).append(url).append(utc_offset).append(time_zone).append(notifications).append(profile_use_background_image).append(friends_count).append(profile_sidebar_fill_color).append(screen_name).append(id_str).append(profile_image_url).append(listed_count).append(is_translator).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof User) == false) {
            return false;
        }
        User rhs = ((User) other);
        return new EqualsBuilder().append(location, rhs.location).append(default_profile, rhs.default_profile).append(statuses_count, rhs.statuses_count).append(profile_background_tile, rhs.profile_background_tile).append(lang, rhs.lang).append(profile_link_color, rhs.profile_link_color).append(profile_banner_url, rhs.profile_banner_url).append(id, rhs.id).append(following, rhs.following).append(favourites_count, rhs.favourites_count).append(_protected, rhs._protected).append(profile_text_color, rhs.profile_text_color).append(verified, rhs.verified).append(description, rhs.description).append(contributors_enabled, rhs.contributors_enabled).append(profile_sidebar_border_color, rhs.profile_sidebar_border_color).append(name, rhs.name).append(profile_background_color, rhs.profile_background_color).append(created_at, rhs.created_at).append(default_profile_image, rhs.default_profile_image).append(followers_count, rhs.followers_count).append(profile_image_url_https, rhs.profile_image_url_https).append(geo_enabled, rhs.geo_enabled).append(profile_background_image_url, rhs.profile_background_image_url).append(profile_background_image_url_https, rhs.profile_background_image_url_https).append(follow_request_sent, rhs.follow_request_sent).append(url, rhs.url).append(utc_offset, rhs.utc_offset).append(time_zone, rhs.time_zone).append(notifications, rhs.notifications).append(profile_use_background_image, rhs.profile_use_background_image).append(friends_count, rhs.friends_count).append(profile_sidebar_fill_color, rhs.profile_sidebar_fill_color).append(screen_name, rhs.screen_name).append(id_str, rhs.id_str).append(profile_image_url, rhs.profile_image_url).append(listed_count, rhs.listed_count).append(is_translator, rhs.is_translator).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}